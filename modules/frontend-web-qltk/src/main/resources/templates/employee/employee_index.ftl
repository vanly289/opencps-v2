 <#include "init.ftl">

<div id="employee-index-page">

	<#-- <div  class="row">

		<div class="col-md-9 PR0-lg">
	
			<div id="employee-list-screen">
	
				<div class="row">
	
					<div id="employee-list-filter" class="col-sm-3">
						
						<#include "employee_nav.ftl">
						
					</div>
					
					<div id="employee-list-wrapper" class="col-sm-9 PL0-lg">
						
						<#include "employee_list.ftl">
						
					</div>
					
				</div>
				
			</div>
			
		</div>
		
		<div class="col-md-3">
		
			<#include "employee_birthdate.ftl">
	
		</div> -->
		<div class="row">
			<div class="col-sm-12 col-xs-12">
				<#include "employee_list.ftl">
			</div>
		</div>
</div>
<span id="notification" style="display:none;"></span>

<!-- templates -->
<script id="errorTemplate" type="text/x-kendo-template">
	<div class="popup-error-notification">
		<p>#= message #</p>
	</div>
</script>

<script id="successTemplate" type="text/x-kendo-template">
	<div class="popup-success-notification">
		<p>#= message #</p>
	</div>
</script>

<style type="text/css">
	/* Over the pointer-events:none, set the cursor to not-allowed.
	On this way you will have a more user friendly cursor. */
	.disabled-tab {
		cursor: not-allowed;
	}
	/* Clicks are not permitted and change the opacity. */
	li.disabled-tab > a[data-toggle="tab"] {
		pointer-events: none;
		filter: alpha(opacity=65);
		-webkit-box-shadow: none;
		box-shadow: none;
		opacity: .65;
	}
</style>

<!-- script -->
<script type="text/javascript">
	// notification
	var notification;
	var showMessageToastr;
	var showMessageByAPICode;
	var arrayToTree;
	var getImageBlob;

	$(document).ready(function() {
		notification = $("#notification").kendoNotification({
			position: {
				pinned: true,
				top: 30,
				right: 30
			},
			autoHideAfter: 3500,
			stacking: "down",
			templates: [
			{
				type: "success",
				template: $("#successTemplate").html()
			},
			{
				type: "error",
				template: $("#errorTemplate").html()
			}
			]
		}).data("kendoNotification");

		// kendo combo box auto open when click
		$("[data-role=combobox]").each(function() {
			var widget = $(this).getKendoComboBox();
			try {
				widget.input.on("focus", function() {
					widget.open();
				});
			} catch (e) {
				console.log(e);
			}
		});

		$("[role=combobox]").each(function() {
			var widget = $(this).getKendoComboBox();
			try {
				widget.input.on("focus", function() {
					widget.open();
				});
			} catch (e) {
				console.log(e);
			}
		});

		//////////////////////////
		showMessageToastr = function(type, message){
			toastr.options = {
				"closeButton": true,
				"debug": false,
				"progressBar": true,
				"positionClass": "toast-top-right",
				"onclick": null,
				"showDuration": "400",
				"hideDuration": "1000",
				"timeOut": "4000",
				"extendedTimeOut": "1000",
				"showEasing": "swing",
				"hideEasing": "linear",
				"showMethod": "fadeIn",
				"hideMethod": "fadeOut"
			};
			toastr[type](message);
		}

		showMessageByAPICode = function(code) {

			var message,status;

			switch (code) {

				case 200:
				message = "Yêu cầu của bạn được xử lý thành công!";
				status = "success";
				break;

				case 401:
				message = "Yêu cầu của bạn xử lý thất bại, chưa đăng nhập vào hệ thống!!!";
				status = "error";
				break;

				case 403:
				message = "Yêu cầu của bạn xử lý thất bại, không có quyền thay đổi dữ liệu!!!";
				status = "error";
				break;

				case 404:
				message = "Yêu cầu của bạn xử lý thất bại, không tìm thấy tài nguyên!!!";
				status = "error";
				break;

				case 405:
				message = "Yêu cầu không được phép xử lý!!!";
				status = "error";
				break;

				case 406:
				message = "Dữ liệu đang được sử dụng, không thể xoá tài nguyên!!!";
				status = "error";
				break;
				
				case 409:
				message = "Yêu cầu của bạn xử lý thất bại, xung đột dữ liệu";
				status = "error";
				break;

				case 500:
				message = "Yêu cầu của bạn xử lý thất bại, lỗi hệ thống";
				status = "error";
				break;

				default:
				message = "Lỗi kết nối!!!";
				status = "error";
				break;
			}

			showMessageToastr(status, message);

		}

		arrayToTree = function(arr, idKey, parentKey, childrenKey) {
			var tree = [],
			mappedArr = {},
			arrElem,
			mappedElem;

			//remove level cause kendo panelBar have a function level()
			arr = arr.map(function(item) {
				
				if (item.hasOwnProperty('level')) {
					item.treeLevel = item.level;
					delete item.level;
				}
				return item; 
			});

			idKey = (idKey==null || idKey=="" || idKey === undefined)?"id":idKey;
			parentKey = (parentKey==null || parentKey=="" || parentKey === undefined)?"parentId":parentKey;
			childrenKey = (childrenKey==null || childrenKey=="" || childrenKey === undefined)?"childrens":childrenKey; 

			// First map the nodes of the array to an object -> create a hash table.
			for(var i = 0, len = arr.length; i < len; i++) {
				arrElem = arr[i];
				mappedArr[arrElem[idKey]] = arrElem;
				mappedArr[arrElem[idKey]][childrenKey] = [];
			}


			for (var id in mappedArr) {
				
				if (mappedArr.hasOwnProperty(id)) {
					mappedElem = mappedArr[id];
					// If the element is not at the root level, add it to its parent array of children.
					if (mappedElem[parentKey]) {
						mappedArr[mappedElem[parentKey]][childrenKey].push(mappedElem);
					}
					// If the element is at the root level, add it to first level elements array.
					else {
						tree.push(mappedElem);
					}
				}
			}
			return tree;
		}

		getImageBlob = function(url, imgTarget){
			var xhr = new XMLHttpRequest();
			xhr.open("GET", url);
			xhr.setRequestHeader("groupId", parseInt("${groupId}"));
			xhr.responseType = "arraybuffer";
			xhr.onerror = function() {};
			xhr.onload = function () {
				if (this.readyState == 4 && this.status === 200) {
					//console.log(this.response, typeof this.response);
					//console.log(this.getResponseHeader('content-type'));
					var blob = new Blob([xhr.response], {type: this.getResponseHeader('content-type')});
					var objectUrl = URL.createObjectURL(blob);
					//window.open(objectUrl);
					imgTarget.attr("src", objectUrl);
				}
			};
			xhr.send();
		}
	});
</script>

<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;"> <div class="modal-dialog" style="position: relative !important;"> <div class="modal-content" style="padding-bottom: 15px;"> </div> </div> <!-- /.modal-dialog --> </div>

<div class="modal fade" id="modal-lg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;"> <div class="modal-dialog modal-lg" style="position: relative !important;"> <div class="modal-content" style="padding-bottom: 15px;"> </div> </div> <!-- /.modal-dialog --> </div>
