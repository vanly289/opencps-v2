<#if (Request)??>
<#include "init.ftl">
</#if>
<div class="row">
	<div class="col-xs-12 col-sm-3 panel P0">
		<div class="panel-body">
			<div class="row">
				<div class="col-xs-12 col-sm-12">
					<button id="btn_add_deliverable_type" class="k-button btn-primary form-control" title="Thêm mẫu hồ sơ"><i class="glyphicon glyphicon-plus"></i> Thêm mẫu giấy phép </button>
				</div>
			</div>
			<div class="row MT10">
				<div class="col-xs-12 col-sm-12">
					<div class="input-group">
						<input type="text" class="form-control" id="input_search_deliverable_type" placeholder="Số mẫu cấp phép" title="Nhập Sô mẫu cấp phép để tìm kiếm">
						<div class="input-group-addon btn-primary" id="btn_search_deliverable_type" title="Tìm kiếm"><i class="fa fa-search" aria-hidden="true"></i></div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-xs-12 col-sm-12">
			<ul id ="deliverable_type_list_view" class="ul-with-border ul-with-border-style-2"></ul>
			<div id="deliverable_type_pager" class="k-pager-wrap"></div>
		</div>

		<script type="text/x-kendo-template" id="deliverable_type_template">
			<li class="clearfix" data-pk="#: id #" style="padding: 10px 0 10px 5px;" role="option" aria-selected="true">
				<div class="P0 col-xs-12 col-sm-12 deliverable-type-item" data-pk="#: id #">
					<strong>#: deliverableType #</strong>
					<a class="btn-group k-delete-button pull-right" href="\\#" title="Xóa">
						<i aria-hidden="true" class="fa fa-trash"></i>
					</a>
				</div>
				<div class="P0 col-xs-12 col-sm-12">
					<div class="edit-buttons">
						<span class="btn-block">#: deliverableName #</span>
					</div>
				</div>
			</li>
		</script>
	</div>

	<div class="col-xs-12 col-sm-9">
		<div class="panel panel-body">
			<#include "deliverabletype_detail.ftl">
		</div>
	</div>
</div>

<script type="text/javascript">
	(function($){
		var deliverableTypeDataSource = new kendo.data.DataSource({
			transport: {
				read: function(options) {
					$.ajax({
						url: "${api.server}" + "/deliverabletypes",
						type: "GET",
						dataType: "json",
						headers: {"groupId": ${groupId}},
						success: function(result) {
							options.success(result);
						}
					});
				},
				destroy: function(options) {
					$.ajax({
						url: "${api.server}" + "/deliverabletypes/" + options.data.deliverableTypeId,
						type: "DELETE",
						dataType: "json",
						headers: {"groupId": ${groupId}},
						success: function(result) {
							options.success(result);
							notification.show({
								message: "Yêu cầu được thực hiện thành công"
							}, "success");

							$("#deliverable_type_list_view li.k-state-selected").removeClass("k-state-selected");
							$('.nav-tabs a[href="#ttmgp"]').tab('show');
							$("ul.nav.nav-tabs li:not(:first)").addClass("disabled-tab");

							var viewModel = kendo.observable({
								deliverableTypeId: "",
								deliverableType : "",
								deliverableName : "",
								codePattern : "",
								counter: "",
								formScript: "",
								formReport: "",
								mappingData: ""
							});

							kendo.bind($("#ttmgp"), viewModel);
							kendo.bind($("#ttform"), viewModel);

							$("#_deliverableType_submitEditDeliverableType").attr("data-pk", "");
						},
						error: function(result) {
							options.error(result);
							notification.show({
								message: "Xẩy ra lỗi, vui lòng thử lại"
							}, "error");
						}
					});
				},
				parameterMap: function(options, operation) {
					if (operation !== "read" && options.models) {
						return {
							models: kendo.stringify(options.models)
						};
					}
				},
			},
			error: function(e){
				this.cancelChanges();
			},
			schema: {
				total: "total",
				data: "data",
				model : { 
					id: "deliverableTypeId",
					fields: {	
						deliverableTypeId: {
							type: "string"
						},				
						deliverableType: {
							type: "string"
						},
						deliverableName: {
							type: "string"
						},
						codePattern: {
							type: "string"
						},
						counter: {
							type: "string"
						},
						formScript: {
							type: "string"
						},
						formReport: {
							type: "string"
						},
						mappingData: {
							type: "string"
						}
					}				
				}
			},
			pageSize: 10,
			serverPaging: false,
			serverSorting: false,
			serverFiltering: false
		});
		
		var firstTimeLoad = true;
		$("#deliverable_type_list_view").kendoListView({
			dataSource: deliverableTypeDataSource,
			template: kendo.template($("#deliverable_type_template").html()),
			selectable: true,
			dataBound: function(e) {

				if (firstTimeLoad){
					var listView = e.sender;
					var firstItem = listView.element.children().first();
					listView.select(firstItem);

					$("#_deliverableType_submitEditDeliverableType").attr("data-pk", firstItem.attr("data-pk"));

					firstTimeLoad = false;
				}
			},
			remove: function(e) {
				if(!confirm("Xác nhận xóa mẫu giấy phép: " + e.model.get("deliverableName") + "?")){
					e.preventDefault();
				}
			},
			change: function() {
				var index = this.select().index();
				var dataItem = this.dataSource.view()[index];
				
				var viewModel = kendo.observable({
					deliverableTypeId: dataItem.id,
					deliverableType : dataItem.deliverableType,
					deliverableName : dataItem.deliverableName,
					codePattern : dataItem.codePattern,
					counter: dataItem.counter,
					formScript: dataItem.formScript,
					formReport: dataItem.formReport,
					mappingData: dataItem.mappingData
				});

				kendo.bind($("#ttmgp"), viewModel);
				kendo.bind($("#ttform"), viewModel);

				$("#_deliverableType_submitEditDeliverableType").attr("data-pk", dataItem.id);

				// reset state for left tab
				$('.nav-tabs a[href="#ttmgp"]').tab('show');
				$("ul.nav.nav-tabs li:not(:first)").removeClass("disabled-tab");
				
			}
		});

		$("#deliverable_type_pager").kendoPager({
			dataSource: deliverableTypeDataSource,
			buttonCount: 2,
			messages: {
				display: "Hiển thị {0}-{1} trong {2} kết quả",
				empty: "Không có kết quả phù hợp!"
			}
		});
		
		$("#input_search_deliverable_type").keyup(function(e){
			deliverableTypeFilter();
		});

		$("#btn_search_deliverable_type").click(function(){
			deliverableTypeFilter();
		});

		var deliverableTypeFilter = function(){
			var inputSearch = $("#input_search_deliverable_type").val();

			var filters = [];
			var filter = {};

			filters.push({field: "deliverableType", operator: "contains", value: inputSearch});
			filters.push({field: "deliverableName", operator: "contains", value: inputSearch});

			filter = {
				logic: "or",
				filters: filters
			};

			deliverableTypeDataSource.filter(filter);
		};

		$(document).on("click", ".btn-edit-deliverable-type", function(event){
			event.preventDefault();
			formControl($(this).attr("data-pk"));
		});

		$(document).on("click", "#btn_add_deliverable_type", function(event){
			event.preventDefault();

			$("#deliverable_type_list_view li.k-state-selected").removeClass("k-state-selected");
			$('.nav-tabs a[href="#ttmgp"]').tab('show');
			$("ul.nav.nav-tabs li:not(:first)").addClass("disabled-tab");

			var viewModel = kendo.observable({
				deliverableTypeId: "",
				deliverableType : "",
				deliverableName : "",
				codePattern : "",
				counter: "",
				formScript: "",
				formReport: "",
				mappingData: ""
			});

			kendo.bind($("#ttmgp"), viewModel);
			kendo.bind($("#ttform"), viewModel);

			$("#_deliverableType_submitEditDeliverableType").attr("data-pk", "");
		});

	})(jQuery);
</script>
