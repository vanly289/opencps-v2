
<#if (Request)??>
<#include "init.ftl">
</#if>

<div>
	<div class="row">
		<div class="col-xs-12 col-sm-12">
			<button id="btn_add_service_process_plugin" class="k-button btn-primary" title="Thêm plugin"><i class="glyphicon glyphicon-plus"></i> Thêm plugin </button>
		</div>
	</div>
	<div class="row MT10">
		<div>
			<!-- list view header -->
			<ul class="mimic-table">
				<li class="clearfix">
					<div class="col-sm-1 text-center">
						<b>STT</b>
					</div>
					<div class="col-sm-5 text-center">
						<b>Tên plugin</b>
					</div>
					<div class="col-sm-4 text-center">
						<b class="hover-pointer" id="sortStepCode" sort="stepCode" sort-type="asc">Bước thực hiện plugin </b> <i class="fa fa-sort text-light-gray" aria-hidden="true"></i>
					</div>
					<div class="col-sm-2 text-center">
						<b>Hành động</b>
					</div>
				</li>
			</ul>
			<ul id ="service_process_plugin_listview" class="mimic-table"></ul>
			<div id="service_process_plugin_bager" class="k-pager-wrap full-width-pager pull-right PR15 PB15"></div>
		</div>

		<script type="text/x-kendo-template" id="service_process_plugin_template">
			<li class="clearfix eq-height-lg" data-pk="#: id #" style="padding: 10px 0 10px 5px;" role="option" aria-selected="true">
				<div class="col-sm-1 text-center center-all">
					#: itemIndex #
				</div>
				<div class="col-sm-5 item-serviceinfo text-hover-blue hover-pointer align-middle-lg" data-pk="#: id #">
					#: pluginName #
				</div>
				<div class="col-sm-4 align-middle-lg text-center">
					#: stepName #
				</div>
				<div class="col-sm-2 text-center">
					<a class="btn-group btn-edit-service-process-plugin" data-pk="#: id #" href="\\#" title="Sửa">
						<i aria-hidden="true" class="fa fa-pencil"></i>
					</a>
					<a class="btn-group k-delete-button" href="\\#" title="Xóa">
						<i aria-hidden="true" class="fa fa-times"></i>
					</a>
				</div>
			</li>
		</script>
	</div>

	<!-- service process step form modal -->
	<div class="modal fade" id="service_process_plugin_form">
		<div class="modal-dialog modal-lg">
			<div class="modal-content"></div>
		</div>
	</div>

	<script type="text/javascript">
		(function($){
			var serviceProcessPluginDataSource = new kendo.data.DataSource({
				transport: {
					read: function(options) {
						if ($("#btn_save_service_process").attr("data-pk")){
							$.ajax({
								url: "${api.server}" + "/serviceprocesses/" + $("#btn_save_service_process").attr("data-pk") + "/plugins",
								type: "GET",
								dataType: "json",
								headers: {"groupId": ${groupId}},
								data: {
								},
								success: function(result) {
									if(result.data){
										options.success(result);
										serviceProcessPluginDataSource.sort({ field: "stepCode", dir: "asc" });
									}else {
										options.success({
											"data" : [],
											"total" : 0
										});
									}
								},
								error: function(result) {
									options.error(result);
								}
							});
						}
					},
					destroy: function(options) {
						$.ajax({
							url: "${api.server}" + "/serviceprocesses/" + $("#btn_save_service_process").attr("data-pk") + "/plugins/" + options.data.processPluginId,
							dataType: "json",
							type: "DELETE",
							headers: {"groupId": ${groupId}},
							success: function(result) {
								options.success(result);
								notification.show({
									message: "Yêu cầu được thực hiện thành công"
								}, "success");
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
					model : { id: "processPluginId" },
				},
				pageSize: 20,
				serverPaging: false,
				serverSorting: false,
				serverFiltering: false
			});
			
			var localIndex = 0;
			$("#service_process_plugin_listview").kendoListView({
				dataSource: serviceProcessPluginDataSource,
				template: function(data){
					var _pageSize = serviceProcessPluginDataSource.pageSize();
					localIndex++;
					var currentPage = $("#service_process_action_bager").data("kendoPager").page();
					var totalPage =  $("#service_process_action_bager").data("kendoPager").totalPages();
					var index = (currentPage-1)*_pageSize + localIndex;
					data.itemIndex = index;
					return kendo.template($("#service_process_plugin_template").html())(data);
				},
				dataBound: function() {
					localIndex = 0;
				},
				autoBind: false,
				remove: function(e) {
					if(!confirm("Xác nhận xóa plugin: " + e.model.get("pluginName") + "?")){
						e.preventDefault();
					}
				},
			});	
			
			var sortFieldProcessPlugin = function(selected){
				var sortItem = $(selected).attr("sort");
				var sortType = $(selected).attr("sort-type");

				if (sortType == "desc") {
					serviceProcessPluginDataSource.sort({ field: sortItem, dir: "desc" });
					$(selected).attr("sort-type","asc");
				} else {
					serviceProcessPluginDataSource.sort({ field: sortItem, dir: "asc" });
					$(selected).attr("sort-type","desc");
				}
			};

			$("#sortStepCode").click(function(){
				sortFieldProcessPlugin(this);
			});			

			$("#service_process_plugin_bager").kendoPager({
				dataSource: serviceProcessPluginDataSource,
				buttonCount: 3,
				pageSizes: [5, 10, 20, 50],
				info: false,
				messages: {
					itemsPerPage: ""
				}
			});

			$(document).on("click", ".btn-edit-service-process-plugin", function(event){
				event.preventDefault();

				$("#serviceprocess_plugin_container").hide();
				$("#serviceprocess_detail_formplugin_container").show();

				var serviceProcessPlugin = serviceProcessPluginDataSource.get(($(this).attr("data-pk")));

				console.log("serviceProcessPlugin==============",serviceProcessPlugin);

				var viewModel = kendo.observable({
					stepCode: serviceProcessPlugin.stepCode,
					stepName: serviceProcessPlugin.stepName,
					serviceProcessId: serviceProcessPlugin.serviceProcessId,
					pluginName: serviceProcessPlugin.pluginName,
					sequenceNo: serviceProcessPlugin.sequenceNo,
					pluginForm: serviceProcessPlugin.pluginForm,
					sampleData: serviceProcessPlugin.sampleData,
					autoRun: serviceProcessPlugin.autoRun

				});

				kendo.bind($("#serviceprocesses_detail_form_plugin"), viewModel);

				initStepPluginCombobox();
				
				$("#btn_save_service_process_plugin").attr("data-pk", $(this).attr("data-pk"));
			});	
			
			$("#btn_cancle_service_process_plugin").click(function(e){
				e.preventDefault();
				$("#serviceprocess_plugin_container").show();
				$("#serviceprocess_detail_formplugin_container").hide();
			});

			$(document).off("click", "#btn_add_service_process_plugin");
			$(document).on("click", "#btn_add_service_process_plugin", function(event){
				event.preventDefault();
				$("#serviceprocess_plugin_container").hide();
				$("#serviceprocess_detail_formplugin_container").show();

				var viewModel = kendo.observable({
					stepCode: "",
					stepName: "",
					serviceProcessId: "",
					pluginName: "",
					sequenceNo: "",
					pluginForm: "",
					sampleData: "",
					autoRun: ""
				});

				initStepPluginCombobox();

				kendo.bind($("#serviceprocesses_detail_form_plugin"), viewModel);

				$("#btn_save_service_process_plugin").attr("data-pk", "");
			});

			$(document).off("click", "#btn_save_service_process_plugin");
			$(document).on("click", "#btn_save_service_process_plugin", function(event){
				event.preventDefault();

				var serviceProcessId = $("#btn_save_service_process").attr("data-pk");
				var pluginId = $(this).attr("data-pk");

				if (pluginId){
					updateServiceProcessPlugin(serviceProcessId, pluginId);
				} else {
					addServiceProcessPlugin(serviceProcessId);
				}
			});	
			
			var updateServiceProcessPlugin = function(serviceProcessId, pluginId){
				if (validateProcessPlugin()){
					$.ajax({
						url: "${api.server}" + "/serviceprocesses/" + serviceProcessId + "/plugins/" + pluginId,
						type: "PUT",
						dataType: "json",
						headers: {"groupId": ${groupId}},
						data: {
							stepCode: $("#pluginStepCode").val(),
							stepName: $("#stepName").val(),
							serviceProcessId: $("#serviceProcessId").val(),
							pluginName: $("#pluginName").val(),
							sequenceNo: $("#pluginSequenceNo").val(),
							pluginForm: $("#pluginForm").val(),
							sampleData: $("#pluginSampleData").val(),
							autoRun: $("#autoRun").prop("checked")
						},
						success: function(result) {
							notification.show({
								message: "Yêu cầu được thực hiện thành công"
							}, "success");
							$("#serviceprocess_plugin_container").show();
							$("#serviceprocess_detail_formplugin_container").hide();

							serviceProcessPluginDataSource.read();

							
						},
						error: function(result) {
							if (result.responseJSON.description){
								notification.show({
									message: result.responseJSON.description
								}, "error");
							} else {
								notification.show({
									message: "Xẩy ra lỗi, vui lòng thử lại"
								}, "error");
							}

							$("#serviceprocess_plugin_container").show();
							$("#serviceprocess_detail_formplugin_container").hide();
						}
					});
				}
			};
			
			var addServiceProcessPlugin = function(serviceProcessId){
				if (validateProcessPlugin()){
					$.ajax({
						url: "${api.server}" + "/serviceprocesses/" + serviceProcessId + "/plugins",
						type: "POST",
						dataType: "json",
						headers: {"groupId": ${groupId}},
						data: {
							stepCode: $("#pluginStepCode").val(),
							serviceProcessId: $("#serviceProcessId").val(),
							pluginName: $("#pluginName").val(),
							sequenceNo: $("#pluginSequenceNo").val(),
							pluginForm: $("#pluginForm").val(),
							sampleData: $("#pluginSampleData").val(),
							autoRun: $("#autoRun").prop("checked")
						},
						success: function(result) {
							notification.show({
								message: "Yêu cầu được thực hiện thành công"
							}, "success");

							$("#serviceprocess_plugin_container").show();
							$("#serviceprocess_detail_formplugin_container").hide();

							serviceProcessPluginDataSource.insert(0, {
								"processPluginId": result.processPluginId,
								"stepCode": $("#pluginStepCode").val(),
								"stepName": result.stepName,
								"serviceProcessId": $("#serviceProcessId").val(),
								"pluginName": $("#pluginName").val(),
								"sequenceNo" : $("#pluginSequenceNo").val(),
								"pluginForm": $("#pluginForm").val(),
								"sampleData" : $("#pluginSampleData").val(),
								"autoRun": $("#autoRun").prop("checked")
							});

							
						},
						error: function(result) {
							if (result.responseJSON.description){
								notification.show({
									message: result.responseJSON.description
								}, "error");
							} else {
								notification.show({
									message: "Xẩy ra lỗi, vui lòng thử lại"
								}, "error");
							}

							$("#serviceprocess_plugin_container").show();
							$("#serviceprocess_detail_formplugin_container").hide();
						}
					});
				}
			};

			function validateProcessPlugin(){
				if (!$("#pluginStepCode").val()){
					notification.show({
						message: "Mời chọn mã bước"
					}, "error");
					return false;
				}
				return true;
			}

			function initStepPluginCombobox(){
				$("#pluginStepCode").kendoComboBox({
					dataTextField: "stepName",
					dataValueField: "stepCode",
					filter: "contains",
					//async: false,
					dataSource : {
						transport : {
							read : function(options) {
								$.ajax({
									url : "${api.server}/serviceprocesses/" + $("#btn_save_service_process").attr("data-pk") + "/steps",
									dataType : "json",
									type : "GET",
									headers: {"groupId": ${groupId}},
									success : function(result){
										options.success(result);									
									},
									error : function(xhr){
										options.error(xhr);
									}
								});
							}
						},
						schema: {
							data : "data",
							total : "total"
						}
					},
					noDataTemplate: 'Không có dữ liệu'
				});
			};
		})(jQuery);
	</script>
</div>
