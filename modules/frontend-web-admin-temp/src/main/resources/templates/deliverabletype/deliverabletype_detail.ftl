<#include "init.ftl">

<div class="row nav-tabs-wrapper">
  <ul class="nav nav-tabs">
      <li class="active" id="deliverabletype_detail_tab_1">
          <a data-toggle="tab" href="#ttmgp">
              Thông tin mẫu cấp phép
          </a>
      </li>
      <li>
          <a data-toggle="tab" href="#ttform">
              Mã nguồn tạo form
          </a>
      </li>
  </ul>
  <div class="tab-content">
      <div id="ttmgp" class="tab-pane fade in active">
		<form id="_deliverableTypeSubDetail_form">
		
			<!--_deliverableTypeSubDetail_deliverableTypeId-->
			
			<div class="form-group">

				<input type="hidden" id="_deliverableTypeSubDetail_deliverableTypeId" data-bind="value:deliverableTypeId" />
						
			</div>
			
			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_deliverableType-->
			
			<div class="form-group" >
				
				<label>
					Kiểu mẫu cấp phép/giấy chứng nhận:
				</label>
				
				<input type="text" id="_deliverableTypeSubDetail_deliverableType" name="_deliverableTypeSubDetail_deliverableType"
					class="form-control" placeholder="Kiểu mẫu cấp phép/giấy chứng nhận" required validationMessage="Nhập kiểu mẫu cấp phép/giấy chứng nhận" 
						data-bind="value:deliverableType" />
				
			</div>
						            						
			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_deliverableType-->
			
			<div class="form-group" >
				
				<label>
					Tên của giấy phép chứng nhận:
				</label>
				
				<input type="text" id="_deliverableTypeSubDetail_deliverableName" name="_deliverableTypeSubDetail_deliverableName"
					class="form-control" placeholder="Tên của giấy phép chứng nhận" required validationMessage="Nhập tên của giấy phép chứng nhận" 
						data-bind="value:deliverableName" />
				
			</div>

			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_codePattern-->
			
			<div class="form-group" >
				
				<label>
					Chuỗi mẫu sinh số hiệu quản lý giấy cấp phép:
				</label>
				
				<input type="text" id="_deliverableTypeSubDetail_codePattern" name="_deliverableTypeSubDetail_codePattern"
					class="form-control" placeholder="Chuỗi mẫu sinh số hiệu quản lý giấy cấp phép" required validationMessage="Nhập chuỗi mẫu sinh số hiệu quản lý giấy cấp phép" 
						data-bind="value:codePattern" />
				
			</div>

			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_counter-->
			
			<div class="form-group" >
				
				<label>
					Số đếm giấy tờ tạo ra:
				</label>
				
				<input type="text" id="_deliverableTypeSubDetail_counter" name="_deliverableTypeSubDetail_counter"
					class="form-control" placeholder="Số đếm giấy tờ tạo ra" required validationMessage="Nhập số đếm giấy tờ tạo ra" 
						data-bind="value:counter" />
				
			</div>

			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_counter-->
			
			<div class="form-group" >
				
				<label>
					Mã thiết kế xml jasper:
				</label>
				
				<textarea id="_deliverableTypeSubDetail_formReport" 
					name="_deliverableTypeSubDetail_formReport" 
					class="k-textbox form-control" 
					data-bind="value:formReport"></textarea>
				
			</div>

			<!--_deliverableTypeSubDetail__deliverableTypeSubDetail_mappingData-->
			
			<div class="form-group" >
				
				<label>
					Ánh xạ dữ liệu:
				</label>
				
				<textarea id="_deliverableTypeSubDetail_mappingData" 
					name="_deliverableTypeSubDetail_mappingData" 
					class="k-textbox form-control"
					rows="10" 
					data-bind="value:mappingData"></textarea>
				
			</div>

			<div class="form-group text-right" >
					
				<button class="btn btn-sm btn-active" id="_deliverableType_submitEditDeliverableType" 
					name="_deliverableType_submitEditDeliverableType" type="button" 
					data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang lưu thông tin...">
					<i class="fa fa-check-circle"></i> 
					<span class="lfr-btn-label">Cập nhật thay đổi</span> 
				</button> 
				
			</div>
			
		</form>  
      </div>
      <div id="ttform" class="tab-pane fade">
		<div class="row MT20">
		
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				
				  <div class="btn-group">
		
					<button type="button" class="btn btn-active" id="_deliverableType_formtemplate_btnScript">Script</button>
					<button type="button" class="btn btn-active" id="_deliverableType_formtemplate_btnHtml">View html</button>
					
				</div>
		
			</div>
		
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 PT20">
				
				<textarea rows="20" class="form-control" id="_deliverableType_formtemplate_inp" placeholder="Mô tả chi tiết"  data-bind="value:formScript"></textarea>
		
				<div class="PT50 PL50 PB50 PR50" id="_deliverableType_formtemplate_html" style="display: none;">
				</div>
		
			</div>
		
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 PT20 text-center">
				
				<button class="btn btn-sm btn-active" id="_deliverableType_formtemplate_submit" name="_deliverableType_formtemplate_submit" type="button" >
					
					<i class="fa fa-check-circle"></i> 
					<span class="lfr-btn-label">Cập nhật thay đổi</span>
		
				</button> 
		
			</div>
		
		</div>      
     </div>
	 </div>
 </div>

<script type="text/javascript">

(function($) {	
	$(document).on('click', '#_deliverableType_formtemplate_btnScript', function(event){
		
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();

		$("#_deliverableType_formtemplate_inp").show("slow");
		$("#_deliverableType_formtemplate_html").hide("slow");
		
	});

	$(document).on('click', '#_deliverableType_formtemplate_btnHtml', function(event){
		
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();


		$("#_deliverableType_formtemplate_inp").hide("slow");
		$("#_deliverableType_formtemplate_html").show("slow");

		var formTemplate = $("#_deliverableType_formtemplate_inp").val().trim();
		
		try {

			var dataForm = eval("(" + formTemplate + ")");
			$("#_deliverableType_formtemplate_html").alpaca(dataForm);

		} catch (e) {
			
			$("#_deliverableType_formtemplate_html").toggle("slow");
			showMessageToastr("error","Mẫu Alpaca không hợp lệ!!!");

		}
		
	});

	$(document).on('click', '#_deliverableType_formtemplate_submit', function(event){
		
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();
		
		var dataPk = $('#_deliverableTypeSubDetail_deliverableTypeId').val();
		
		$.ajax({
			url: "${api.server}" + "/deliverabletypes/" + dataPk + "/formscript",
			headers: {
				"groupId": ${groupId},
			},
			data: {
				formScript: $("#_deliverableType_formtemplate_inp").val().trim()
			},
			type: 'PUT',
			dataType: 'json',
			
			contentType: 'application/x-www-form-urlencoded; charset=utf-8',
			success: function(data, textStatus, xhr) {
			
				showMessageToastr("success", 'Yêu cầu của bạn được xử lý thành công!');
				
			},
			error: function(xhr, textStatus, errorThrown) {
				
				showMessageByAPICode(xhr.status);
			
			}
		});						
	});
	
		var updateDeliverabletype = function(dataPk) {
			$.ajax({
				url: "${api.server}" + "/deliverabletypes/" + dataPk,
				type: "PUT",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
					deliverableTypeId: dataPk,
					deliverableType: $('#_deliverableTypeSubDetail_deliverableType').val(),
					deliverableName: $('#_deliverableTypeSubDetail_deliverableName').val(),
					codePattern: $('#_deliverableTypeSubDetail_codePattern').val(),
					counter: $('#_deliverableTypeSubDetail_counter').val(),
					formScript: $("#_deliverableType_formtemplate_inp").val().trim(),
					formReport: $('#_deliverableTypeSubDetail_formReport').val(),
					mappingData: $('#_deliverableTypeSubDetail_mappingData').val()
				},
				success: function(result) {
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");
									
					deliverableTypeDataSource.pushUpdate(result);

					$("#deliverable_type_list_view li[data-pk=" + dataPk + "]").addClass("k-state-selected");
				},
				error: function(result) {
					notification.show({
						message: "Xẩy ra lỗi, vui lòng thử lại"
					}, "error");
				}
			});
		}	
			
		var addDeliverabletype = function() {
			$.ajax({
				url: "${api.server}" + "/deliverabletypes",
				type: "POST",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
					deliverableType: $('#_deliverableTypeSubDetail_deliverableType').val(),
					deliverableName: $('#_deliverableTypeSubDetail_deliverableName').val(),
					codePattern: $('#_deliverableTypeSubDetail_codePattern').val(),
					counter: $('#_deliverableTypeSubDetail_counter').val()
				},
				success: function(result) {
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");
							
					deliverableTypeDataSource.add(result);
					$("#deliverable_type_list_view").data("kendoListView").dataSource.read();							
				},
				error: function(result) {
					notification.show({
						message: "Xẩy ra lỗi, vui lòng thử lại"
					}, "error");
				}
			});
		}	

		// submit
	$(' #_deliverableType_submitEditDeliverableType ').click(function(event) {
	
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();
		
		var validator = $("#_deliverableTypeSubDetail_form").kendoValidator().data("kendoValidator");
				
			if (!validator.validate()) {
				return;
			}
			
		var dataPk = $('#_deliverableTypeSubDetail_deliverableTypeId').val();
		if (dataPk) {
			updateDeliverabletype(dataPk);		
		}
		else {
			addDeliverabletype();		
		}
	});
	
})(jQuery);

</script>

