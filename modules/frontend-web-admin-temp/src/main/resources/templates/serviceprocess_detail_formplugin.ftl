<#if (Request)??>
<#include "init.ftl">
</#if>

<div class="">
	<form id="serviceprocesses_detail_form_plugin" name="fm" method="post">
		<div class="row">
			<div class="col-xs-12 col-sm-5">
				<div class="row">
					<div class="col-xs-12 col-sm-12">
						Tên thao tác
					</div>
				</div>
				<div class="row MT5">
					<div class="col-xs-12 col-sm-12">
						<input id="pluginName" name="pluginName" class="k-textbox form-control" required="required" validationMessage="Trường nhập yêu cầu bắt buộc" data-bind="value: pluginName"/>
					</div>
				</div>
			</div>
			<div class="col-xs-1"></div>
			<div class="col-xs-12 col-sm-5">
				<div class="row">
					<div class="col-xs-12 col-sm-12">
						Bước thực hiện thao tác
						
					</div>
				</div>
				<div class="row MT5">
					<div class="col-xs-12 col-sm-12" >
						<input id="pluginStepCode" name="stepCode" class="form-control" required="required" validationMessage="Trường nhập yêu cầu bắt buộc" data-bind="value: stepCode"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row MT10">
			<div class="col-xs-12 col-sm-5">
				<div class="row">
					<div class="col-xs-12 col-sm-12">
						<div class="checkbox"> <input type="checkbox" id="autoRun" name="autoRun" data-bind="checked: autoRun"> <label>Tự động chạy</label> </div>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-1"></div>
		</div>
		<div class="row MT10">
			<div class="col-xs-12 col-sm-12">
				<div class="row">
					<div class="col-xs-12 col-sm-12">Thứ tự</div>
				</div>
				<div class="row MT5">
					<div class="col-xs-12 col-sm-12">
						<input class="form-control" type="text" name="sequenceNo" id="pluginSequenceNo" value="" data-bind="value: sequenceNo">
					</div>
				</div>
			</div>
		</div>

		<div class="row MT10">
			<div class="col-sm-12">
				<div class="row">
					<div class="col-xs-12 col-sm-12">
						Cấu hình form
					</div>
				</div>
				<div class="row MT5">
					<div class="col-xs-12 col-sm-12">
						<textarea class="form-control" name="pluginForm" id="pluginForm" data-bind="value: pluginForm" rows="7"></textarea>
					</div>
				</div>
			</div>
		</div>

		<div class="row MT10">
			<div class="col-sm-12">
				<div class="row">
					<div class="col-xs-12 col-sm-12">
						Dữ liệu mẫu
					</div>
				</div>
				<div class="row MT5">
					<div class="col-xs-12 col-sm-12">
						<textarea class="form-control" name="sampleData" id="sampleData" data-bind="value: sampleData" rows="7"></textarea>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row MT10 text-center">
			<button id="btn_save_service_process_plugin" class="k-button btn-primary" title="Ghi lại">Ghi lại</button>
			<button id="btn_cancle_service_process_plugin" class="k-button btn-default" title="Hủy bỏ">Hủy bỏ</button>
		</div>
	</form>
</div>

<script type="text/javascript">

</script>
