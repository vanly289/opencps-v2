<#if (Request)??>
<#include "init.ftl">
</#if>
<div class="panel panel-body">
	<div class="nav-tabs-wrapper">
		<ul class="nav nav-tabs" id="system-tabstrip">
			<li class="active"  value="1">
				<a data-toggle="tab" href="#site">
					Công cụ Site
				</a>
			</li>
			<li class=""  value="2">
				<a data-toggle="tab" href="#resolveconflict">
					Sửa bất đồng bộ dữ liệu
				</a>
			</li>
			<li class=""  value="3">
				<a data-toggle="tab" href="#garbagecollector">
					Dọn rác hệ thống
				</a>
			</li>
			<li class=""  value="4">
				<a data-toggle="tab" href="#reindex">
					Đánh lại chỉ mục
				</a>
			</li>
		</ul>
		<div id="systemDetail" class="tab-content">
			<div id="site" class="tab-pane fade in active MT15">
				<div class="row">
					<div class="form-group">
						<button type="button" class="btn btn-active" data-toggle="modal" data-target="#confirmDeleteSite">
						  Xoá site
						</button>
						
						<!-- Modal -->
						<div class="modal fade" id="confirmDeleteSite" tabindex="-1" role="dialog" aria-labelledby="confirmDeleteSite" aria-hidden="true">
						  <div class="modal-dialog modal-dialog-centered" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="confirmDeleteTitle">Bạn có chắc chắn muốn xoá ?</h5>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="modal-body">
						      	Bạn có chắc chắn muốn xoá site này ?
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng lại</button>
						        <button data-dismiss="modal" id="btn-deletesite" type="button" class="btn-active btn btn-danger">Xoá dữ liệu Site</button>
						      </div>
						    </div>
						  </div>
						</div>								
					</div>
				</div>
				<div class="row">
					<div id="progressDeleteSite" class="progress">
					  <div id="progressSite" class="progress-bar progress-bar-striped active" role="progressbar"
					  aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width:0%">
					    0%
					  </div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-3">
						<label>Chọn site</label>
					</div>
					<div class="col-xs-12 col-sm-9">
						<div class="form-group">
							<select id="selectSite" class="form-control selectpicker" data-style="btn-info">
								<#list sites as site>
									<option value="${site.groupId}">${site.name}</option>
								<#else>
								    
								</#list>
							</select>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="table-responsive">
						  <table class="table table-hover">
						    <thead>
						      <tr>
						        <th>Dữ liệu</th>
						        <th>Thực thể</th>
						        <th>Số lượng</th>
						      </tr>
						    </thead>
						    <tbody>
						      <tr>
						        <td>Mẫu thông báo</td>
						        <td>Notificationtemplate</td>
						        <td id="NotificationtemplateCount"></td>
						      </tr>
						      <tr>
						        <td>Trao đổi</td>
						        <td>Comment</td>
						        <td id="CommentCount"></td>
						      </tr>
						      <tr>
						        <td>Ngày nghỉ</td>
						        <td>Holiday</td>
						        <td id="HolidayCount"></td>
						      </tr>
						      <tr>
						        <td>Ngữ nghĩa thao tác</td>
						        <td>ActionConfig</td>
						        <td id="ActionConfigCount"></td>
						      </tr>
						      <tr>
						        <td>Giấy phép</td>
						        <td>Deliverable</td>
						        <td id="DeliverableCount"></td>
						      </tr>
						      <tr>
						        <td>Hồ sơ</td>
						        <td>Dossier</td>
						        <td id="DossierCount"></td>
						      </tr>
						      <tr>
						        <td>Thao tác hồ sơ</td>
						        <td>DossierAction</td>
						        <td id="DossierActionCount"></td>
						      </tr>
						      <tr>
						        <td>Thành phần hồ sơ</td>
						        <td>DossierFile</td>
						        <td id="DossierFileCount"></td>
						      </tr>
						      <tr>
						        <td>Nhật ký hồ sơ</td>
						        <td>DossierLog</td>
						        <td id="DossierLogCount"></td>
						      </tr>
						      <tr>
						        <td>Thành phần mẫu hồ sơ</td>
						        <td>DossierPart</td>
						        <td id="DossierPartCount"></td>
						      </tr>
						      <tr>
						        <td>Thống kê hồ sơ</td>
						        <td>DossierStatistic</td>
						        <td id="DossierStatisticCount"></td>
						      </tr>
						      <tr>
						        <td>Mẫu hồ sơ</td>
						        <td>DossierTemplate</td>
						        <td id="DossierTemplateCount"></td>
						      </tr>
						      <tr>
						        <td>Cấu hình menu</td>
						        <td>MenuConfig</td>
						        <td id="MenuConfigCount"></td>
						      </tr>
						      <tr>
						        <td>Cấu hình thanh toán</td>
						        <td>PaymentConfig</td>
						        <td id="PaymentConfigCount"></td>
						      </tr>
						      <tr>
						        <td>Phiếu thanh toán</td>
						        <td>PaymentFile</td>
						        <td id="PaymentFileCount"></td>
						      </tr>
						      <tr>
						        <td>Thao tác</td>
						        <td>ProcessAction</td>
						        <td id="ProcessActionCount"></td>
						      </tr>
						      <tr>
						        <td>Cấu hình dịch vụ công</td>
						        <td>ProcessOption</td>
						        <td id="ProcessOptionCount"></td>
						      </tr>
						      <tr>
						        <td>Bước quy trình</td>
						        <td>ProcessStep</td>
						        <td id="ProcessStepCount"></td>
						      </tr>
						      <tr>
						        <td>Hồ sơ thương nhân</td>
						        <td>Registration</td>
						        <td id="RegistrationCount"></td>
						      </tr>
						      <tr>
						        <td>Mẫu đăng ký hồ sơ thương nhân</td>
						        <td>RegistrationForm</td>
						        <td id="RegistrationForm"></td>
						      </tr>
						      <tr>
						        <td>Nhật ký hồ sơ thương nhân</td>
						        <td>RegistrationLog</td>
						        <td id="RegistrationLogCount"></td>
						      </tr>
						      <tr>
						        <td>Cấu hình dịch vụ</td>
						        <td>ServiceConfig</td>
						        <td id="ServiceConfigCount"></td>
						      </tr>
						      <tr>
						        <td>Thủ tục hành chính</td>
						        <td>ServiceInfo</td>
						        <td id="ServiceInfoCount"></td>
						      </tr>
						      <tr>
						        <td>Quy trình</td>
						        <td>ServiceProcess</td>
						        <td id="ServiceProcessCount"></td>
						      </tr>
						      <tr>
						        <td>Cấu hình bước</td>
						        <td>StepConfig</td>
						        <td id="StepConfigCount"></td>
						      </tr>
						      <tr>
						        <td>Người làm thủ tục</td>
						        <td>Applicant</td>
						        <td id="ApplicantCount"></td>
						      </tr>
						      <tr>
						        <td>Cán bộ</td>
						        <td>Employee</td>
						        <td id="Employee"></td>
						      </tr>
						      <tr>
						        <td>Vị trí việc làm</td>
						        <td>JobPos</td>
						        <td id="JobPos"></td>
						      </tr>
						      <tr>
						        <td>Site cơ quan</td>
						        <td>OfficeSite</td>
						        <td id="OfficeSiteCount"></td>
						      </tr>
						      <tr>
						        <td>Cơ quan</td>
						        <td>WorkingUnit</td>
						        <td id="WorkingUnitCount"></td>
						      </tr>
						  </table>	
					  	</div>			
					</div>
				</div>
			</div>	
			<div id="resolveconflict" class="tab-pane fade in MT15">
				<div class="row">
					<div id="progressRC" class="progress">
					  <div class="progress-bar progress-bar-striped" role="progressbar"
					  aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width:0%">
					    0%
					  </div>
					</div>
				</div>
				<div class="row">
					<button id="btn-searchconflict" type="button" class="btn btn-active btn-success">Kiểm tra đồng bộ hồ sơ</button>
					<button type="button" class="btn btn-active btn-danger">Sửa bất đồng bộ hồ sơ</button>
				</div>
			</div>	
			<div id="garbagecollector" class="tab-pane fade in active MT15">
				<div class="row">
					<div id="progressGC" class="progress">
					  <div class="progress-bar progress-bar-striped active" role="progressbar"
					  aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width:0%">
					    0%
					  </div>
					</div>
				</div>			
				<div class="row">
					<div class="form-group">
						<button type="button" class="btn btn-active btn-primary" data-toggle="modal" data-target="#confirmGC">
						 	Dọn rác
						</button>
						
						<!-- Modal -->
						<div class="modal fade" id="confirmGC" tabindex="-1" role="dialog" aria-labelledby="confirmGC" aria-hidden="true">
						  <div class="modal-dialog modal-dialog-centered" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="confirmGCTitle">Xác nhận ?</h5>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="modal-body">
						      	Bạn có chắc chắn dọn sạch rác trong site này ?
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng lại</button>
						        <button data-dismiss="modal" id="btn-garbagecollector" type="button" class="btn-active btn btn-danger">Dọn sạch</button>
						      </div>
						    </div>
						  </div>
						</div>								
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12 col-sm-3">
						<label>Chọn thư mục không dọn</label>
					</div>
					<div class="col-xs-12 col-sm-9">
						<div class="form-group">
							<select id="selectFolders" class="form-control selectpicker" data-style="btn-info" multiple>
								<#list folders as folder>
									<option value="${folder.folderId}">${folder.name}</option>
								<#else>
								    
								</#list>
							</select>
						</div>
					</div>
				</div>				
				<div class="row">
					<div class="col-xs-12 col-sm-3">
						<label>Chọn tệp không dọn dẹp</label>
					</div>
					<div class="col-xs-12 col-sm-9">
						<div class="form-group">
							<select id="selectFiles" class="form-control selectpicker" data-style="btn-info" multiple>
								<#list files as file>
									<option value="${file.fileEntryId}">${file.fileName}</option>
								<#else>
								    
								</#list>
							</select>
						</div>
					</div>
				</div>				
			</div>
			<div id="reindex" class="tab-pane fade in active MT15">
				<div class="row">
					<div id="progressReindexAll" class="progress">
					  <div class="progress-bar progress-bar-striped active" role="progressbar"
					  aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width:0%">
					    0%
					  </div>
					</div>
				</div>			
				<div class="row">
					<div class="form-group">
						<button type="button" class="btn btn-active" data-toggle="modal" data-target="#confirmReindexAll">
						  Đánh lại chỉ mục tất cả
						</button>
						
						<div class="modal fade" id="confirmReindexAll" tabindex="-1" role="dialog" aria-labelledby="confirmReindexAll" aria-hidden="true">
						  <div class="modal-dialog modal-dialog-centered" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="confirmDeleteTitle">Xác nhận</h5>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="modal-body">
						      	Bạn có chắc chắn muốn đánh lại toàn bộ chỉ mục ?
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng lại</button>
						        <button data-dismiss="modal" id="btn-reindexall" type="button" class="btn-active btn btn-danger">Đánh lại chỉ mục</button>
						      </div>
						    </div>
						  </div>
						</div>							
					</div>
				</div>
			</div>			
		</div>
	</div>
</div>
<script type="text/javascript">
	(function($){
		var backgroundTaskId = 0;
		$('#progressDeleteSite').hide();
		$('#progressReindexAll').hide();
		$('#progressRC').hide();
		$('#progressGC').hide();
		
		$('#btn-searchconflict').click(function() {
			$.ajax({
				url: "${api.server}" + "/dossiers/lucene/searchconflict",
				type: "GET",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
							
				},
				success: function(result) {
					
				}
			});			
		});
		
		var checkProgress = function timeout() {
		    setTimeout(function () {
				$.ajax({
					url: "${api.server}" + "/system/progress/" + backgroundTaskId,
					type: "GET",
					dataType: "json",
					headers: {"groupId": ${groupId}},
					data: {
								
					},
					success: function(result) {
						$('.progress-bar').css('width', result.percentage +'%').attr('aria-valuenow', result.percentage);
						$('#progressSite').text(result.percentage + "% " + result.executionLog);
						if (result.percentage == 100) {
							$('#progressDeleteSite').hide();			
						}
						else {
					        timeout();			
						}
					}
				});
		    }, 1000);
		};
		
		var checkReindexAllProgress = function timeout() {
		    setTimeout(function () {
				$.ajax({
					url: "${api.server}" + "/system/progress/" + backgroundTaskId,
					type: "GET",
					dataType: "json",
					headers: {"groupId": ${groupId}},
					data: {
								
					},
					success: function(result) {
						$('.progress-bar').css('width', result.percentage +'%').attr('aria-valuenow', result.percentage);
						$('#progressReindexAll').text(result.percentage + "% " + result.executionLog);
						if (result.percentage == 100) {
							$('#progressReindexAll').hide();			
						}
						else {
					        timeout();			
						}
					}
				});
		    }, 1000);
		};
				
		$('#btn-deletesite').click(function() {
			$('#progressDeleteSite').show();
			$.ajax({
				url: "${api.server}" + "/system/clean/" + $('#selectSite').val(),
				type: "POST",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
							
				},
				success: function(result) {
					backgroundTaskId = result.backgroundTaskId;
					$('#progressDeleteSite').show();	
					checkProgress();		
				}
			});			
		});
		
		$('#btn-reindexall').click(function() {
		$('#progressReindexAll').show();
			$.ajax({
				url: "${api.server}" + "/system/reindexall",
				type: "POST",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
							
				},
				success: function(result) {
					backgroundTaskId = result.backgroundTaskId;
					$('#progressReindexAll').show();	
					checkReindexAllProgress();		
				}
			});			
		});		
		
		var checkGarbageCollectorProgress = function timeout() {
		    setTimeout(function () {
				$.ajax({
					url: "${api.server}" + "/system/progress/" + backgroundTaskId,
					type: "GET",
					dataType: "json",
					headers: {"groupId": ${groupId}},
					data: {
								
					},
					success: function(result) {
						$('.progress-bar').css('width', result.percentage +'%').attr('aria-valuenow', result.percentage);
						$('#progressGC').text(result.percentage + "% " + result.executionLog);
						if (result.percentage == 100) {
							$('#progressGC').hide();			
						}
						else {
					        timeout();			
						}
					}
				});
		    }, 1000);
		};
				
		$('#btn-garbagecollector').click(function() {
			$('#progressGC').show();
			$.ajax({
				url: "${api.server}" + "/system/garbagecollector",
				type: "POST",
				dataType: "json",
				headers: {"groupId": ${groupId}},
				data: {
					"excludeFolders": $('#selectFolders').val() ? $('#selectFolders').val().join(",") : "",	
					"excludeFiles": $('#selectFiles').val() ? $('#selectFiles').val().join(",") : ""
				},
				success: function(result) {
					backgroundTaskId = result.backgroundTaskId;
					$('#progressGC').show();	
					checkGarbageCollectorProgress();		
				}
			});			
		});		
		
	})(jQuery);
</script>