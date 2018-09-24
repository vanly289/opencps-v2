			'giayPhepVanTaiQuocTeTable': {
				'id': 'giayPhepVanTaiQuocTeTable',
				'name': 'giayPhepVanTaiQuocTeTable',
				'type': 'table',
				'no_data_text': 'Không tìm thấy hồ sơ nào!',
				'cssClass': 'danhSachHoSoTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'danh_sach_giay_phep_van_tai_quoc_te_template',
				'pagging': '_paggingGiayPhepVanTaiQuocTeTable',
				'next': '_nextGiayPhepVanTaiQuocTeTable',
				'previous': '_previousGiayPhepVanTaiQuocTeTable',
				'events': {
					_inigiayPhepVanTaiQuocTeTable: function (append) {
						var vm = this;
						vm.traCuuFilter = false;
						vm.viewmore = true;

						this.giayPhepVanTaiQuocTeTableheaders = [
						{
							text: 'STT',
							align: 'center',
							sortable: false,
							value: 'stt'
						},
						{
							text: 'Gíây phép - Số giấy phép',
							align: 'left',
							sortable: true,
							value: 'deliverableCode'
						},
						{
							text: 'Tên doanh nghiệp được cấp phép',
							align: 'left',
							sortable: true,
							value: 'applicantName'
						},
						{
							text: 'Cơ quan cấp',
							align: 'left',
							sortable: true,
							value: 'coQuan'
						},
						{
							text: 'Hiệu lực giấy phép',
							align: 'left',
							sortable: true,
							value: 'hieuLuc'
						},
						{
							text: 'Thao tác',
							align: 'left',
							sortable: true,
							value: 'thaoTac'
						}


						];

						var paramsBuilder = {
							follow: true,
							start: vm.giayPhepVanTaiQuocTeTablepage * 15 - 15,
							end: vm.giayPhepVanTaiQuocTeTablepage * 15,
							sort: 'modified',
							order: 'false'
						};

						const config_dossiers = {
							params: paramsBuilder,
							headers: {
								'groupId': themeDisplay.getScopeGroupId(),
							}
						};

						var url = '/o/rest/v2/dossiers/ccc';

						axios.get(url, config_dossiers).then(function (response) {
							var serializable = response.data;


							if (append) {
								vm.giayPhepVanTaiQuocTeTableItems.push.apply(vm.giayPhepVanTaiQuocTeTableItems, serializable.data);
							} else if(serializable.data){

								vm.giayPhepVanTaiQuocTeTableItems = serializable.data;

								vm.giayPhepVanTaiQuocTeTableTotal = Math.ceil(serializable.total / 15);

							}else {
								vm.giayPhepVanTaiQuocTeTableItems = [];

								vm.giayPhepVanTaiQuocTeTableTotal = 0;
							}

							if (vm.listgroupHoSoFilterselectedIndex >= 0) {
								console.log('reindex counting ...');
								vm.listgroupHoSoFilterItems[vm.listgroupHoSoFilterselectedIndex]['count'] = serializable.total;
							}

							vm.xem_them = 'Xem thêm 8+ bản ghi';
							if (!serializable.data) {
								vm.xem_them = 'Tổng số ( ' + serializable.total + ' ) bản ghi'
							}
							vm.viewmore = false;

							$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
								if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
								} else {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
								}
							});
							console.log(vm.giayPhepVanTaiQuocTeTableItems);
						})
						.catch(function (error) {
							console.log(error);
							vm.giayPhepVanTaiQuocTeTableItems = [
							{
								giay_phep: 'abc123',
								so_giay_phep: 'abc123',
								ten_doanh_nghiep: 'abc123',
								co_quan: 'abc123',
								hieu_luc_tu_ngay: 'abc123',
								hieu_luc_den_ngay: 'abc123'
							},
							{
								giay_phep: 'abc123',
								so_giay_phep: 'abc123',
								ten_doanh_nghiep: 'abc123',
								co_quan: 'abc123',
								hieu_luc_tu_ngay: 'abc123',
								hieu_luc_den_ngay: 'abc123'
							},
							{
								giay_phep: 'abc123',
								so_giay_phep: 'abc123',
								ten_doanh_nghiep: 'abc123',
								co_quan: 'abc123',
								hieu_luc_tu_ngay: 'abc123',
								hieu_luc_den_ngay: 'abc123'
							}
							];

						});
						return false; 
					},
					toDetailGiayPhep: function (item) {

						var vm = this;
						vm.stepModel = null;

						var url = '/o/rest/v2/dossiers/'+item.dossierId;

						axios.get(url, config).then(function (response) {
							var serializable = response.data;

							vm.detailModel = serializable;
							vm.detailPage = true;
							window.scrollBy(0, -99999);
						})
						.catch(function (error) {
							console.log(error);

						});
						return false; 
					},
					_paggingGiayPhepVanTaiQuocTeTable: function() {
						this._inigiayPhepVanTaiQuocTeTable(false);
					},
					_nextGiayPhepVanTaiQuocTeTable: function() {

					},
					_previousGiayPhepVanTaiQuocTeTable: function() {

					}
				}
			},
			'giayPhepLienVanTable': {
				'id': 'giayPhepLienVanTable',
				'name': 'giayPhepLienVanTable',
				'type': 'table',
				'no_data_text': 'Không tìm thấy hồ sơ nào!',
				'cssClass': 'danhSachHoSoTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'danh_sach_giay_phep_lien_van_template',
				'pagging': '_paggingGiayPhepLienVanTable',
				'next': '_nextGiayPhepLienVanTable',
				'previous': '_previousGiayPhepLienVanTable',
				'events': {
					_inigiayPhepLienVanTable: function (append) {
						var vm = this;
						vm.traCuuFilter = false;
						vm.viewmore = true;

						this.giayPhepLienVanTableheaders = [
						{
							text: 'STT',
							align: 'center',
							sortable: false,
							value: 'stt'
						},
						{
							text: 'Gíây phép - Số giấy phép',
							align: 'left',
							sortable: true,
							value: 'deliverableCode'
						},
						{
							text: 'Số đăng ký phương tiện Đơn vị khai thác',
							align: 'left',
							sortable: true,
							value: 'applicantName'
						},
						{
							text: 'Cơ quan cấp phép',
							align: 'left',
							sortable: true,
							value: 'coQuan'
						},
						{
							text: 'Hiệu lực giấy phép',
							align: 'left',
							sortable: true,
							value: 'hieuLuc'
						},
						{
							text: 'Thao tác',
							align: 'left',
							sortable: true,
							value: 'thaoTac'
						}


						];

						var paramsBuilder = {
							follow: true,
							dossierNo: vm.dossierNoFilter,
							start: vm.giayPhepLienVanTablepage * 15 - 15,
							end: vm.giayPhepLienVanTablepage * 15,
							sort: 'modified',
							order: 'false'
						};

						const config_dossiers = {
							params: paramsBuilder,
							headers: {
								'groupId': themeDisplay.getScopeGroupId(),
							}
						};

						var url = '/o/rest/v2/dossiers/dossiersTest';

						axios.get(url, config_dossiers).then(function (response) {
							var serializable = response.data;


							if (append) {
								vm.giayPhepLienVanTableItems.push.apply(vm.giayPhepLienVanTableItems, serializable.data);
							} else if(serializable.data){

								vm.giayPhepLienVanTableItems = serializable.data;

								vm.giayPhepLienVanTableTotal = Math.ceil(serializable.total / 15);

							}else {
								vm.giayPhepLienVanTableItems = [];

								vm.giayPhepLienVanTableTotal = 0;
							}

							if (vm.listgroupHoSoFilterselectedIndex >= 0) {
								console.log('reindex counting ...');
								vm.listgroupHoSoFilterItems[vm.listgroupHoSoFilterselectedIndex]['count'] = serializable.total;
							}

							vm.xem_them = 'Xem thêm 8+ bản ghi';
							if (!serializable.data) {
								vm.xem_them = 'Tổng số ( ' + serializable.total + ' ) bản ghi'
							}
							vm.viewmore = false;

							$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
								if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
								} else {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
								}
							});
							console.log(vm.giayPhepLienVanTableItems);
						})
						.catch(function (error) {
							console.log(error);
							vm.giayPhepLienVanTableItems = [
								{
									giay_phep: 'asdfgh',
									so_giay_phep: 'asdfgh',
									so_dang_ky_phuong_tien: 'asdfgh',
									ten_doanh_nghiep: 'asdfgh',
									co_quan: 'asdfgh',
									hieu_luc_tu_ngay: '1/1/2017',
									hieu_luc_den_ngay: '1/1/2018'
								},
								{
									giay_phep: 'asdfgh',
									so_giay_phep: 'asdfgh',
									so_dang_ky_phuong_tien: 'asdfgh',
									ten_doanh_nghiep: 'asdfgh',
									co_quan: 'asdfgh',
									hieu_luc_tu_ngay: '1/1/2017',
									hieu_luc_den_ngay: '1/1/2018'
								},
								{
									giay_phep: 'asdfgh',
									so_giay_phep: 'asdfgh',
									so_dang_ky_phuong_tien: 'asdfgh',
									ten_doanh_nghiep: 'asdfgh',
									co_quan: 'asdfgh',
									hieu_luc_tu_ngay: '1/1/2017',
									hieu_luc_den_ngay: '1/1/2018'
								},
								{
									giay_phep: 'asdfgh',
									so_giay_phep: 'asdfgh',
									so_dang_ky_phuong_tien: 'asdfgh',
									ten_doanh_nghiep: 'asdfgh',
									co_quan: 'asdfgh',
									hieu_luc_tu_ngay: '1/1/2017',
									hieu_luc_den_ngay: '1/1/2018'
								}
							];

						});
						return false; 
					},
					toDetailGiayPhep: function (item) {

						var vm = this;
						vm.stepModel = null;

						var url = '/o/rest/v2/dossiers/'+item.dossierId;

						axios.get(url, config).then(function (response) {
							var serializable = response.data;

							vm.detailModel = serializable;
							vm.detailPage = true;
							window.scrollBy(0, -99999);
						})
						.catch(function (error) {
							console.log(error);

						});
						return false; 
					},
					_paggingGiayPhepLienVanTable: function() {
						this._inigiayPhepLienVanTable(false);
					},
					_nextGiayPhepLienVanTable: function() {

					},
					_previousGiayPhepLienVanTable: function() {

					}
				}
			},
			'chapThuanKhaiThacTable': {
				'id': 'chapThuanKhaiThacTable',
				'name': 'chapThuanKhaiThacTable',
				'type': 'table',
				'no_data_text': 'Không tìm thấy hồ sơ nào!',
				'cssClass': 'danhSachHoSoTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'danh_sach_chap_thuan_khai_thac_tuyen_hanh_khach_template',
				'pagging': '_paggingChapThuanKhaiThacTable',
				'next': '_nextChapThuanKhaiThacTable',
				'previous': '_previousChapThuanKhaiThacTable',
				'events': {
					_inichapThuanKhaiThacTable: function (append) {
						var vm = this;
						vm.traCuuFilter = false;
						vm.viewmore = true;

						this.chapThuanKhaiThacTableheaders = [
						{
							text: 'STT',
							align: 'center',
							sortable: false,
							value: 'stt'
						},
						{
							text: 'Gíây phép - Số giấy phép',
							align: 'left',
							sortable: true,
							value: 'so_giay_phep'
						},
						{
							text: 'Doanh nghiệp đăng ký khai thác',
							align: 'left',
							sortable: true,
							value: 'doanh_nghiep'
						},
						{
							text: 'Tuyến khai thác',
							align: 'left',
							sortable: true,
							value: 'tuyen_khai_thac'
						},
						{
							text: 'Cơ quan cấp phép',
							align: 'left',
							sortable: true,
							value: 'co_quan'
						},
						{
							text: 'Số xe tham gia Hiệu lực khai thác',
							align: 'left',
							sortable: true,
							value: 'hieu_luc'
						},
						{
							text: 'Thao tác',
							align: 'left',
							sortable: true,
							value: 'thao_tac'
						}


						];

						var paramsBuilder = {
							follow: true,
							dossierNo: vm.dossierNoFilter,
							start: vm.chapThuanKhaiThacTablepage * 15 - 15,
							end: vm.chapThuanKhaiThacTablepage * 15,
							sort: 'modified',
							order: 'false'
						};

						const config_dossiers = {
							params: paramsBuilder,
							headers: {
								'groupId': themeDisplay.getScopeGroupId(),
							}
						};

						var url = '/o/rest/v2/dossiers/dossiersTest';

						axios.get(url, config_dossiers).then(function (response) {
							var serializable = response.data;
							if (append) {
								vm.chapThuanKhaiThacTableItems.push.apply(vm.chapThuanKhaiThacTableItems, serializable.data);
							} else if(serializable.data){

								vm.chapThuanKhaiThacTableItems = serializable.data;

								vm.chapThuanKhaiThacTableTotal = Math.ceil(serializable.total / 15);

							}else {
								vm.chapThuanKhaiThacTableItems = [];

								vm.chapThuanKhaiThacTableTotal = 0;
							}

							if (vm.listgroupHoSoFilterselectedIndex >= 0) {
								console.log('reindex counting ...');
								vm.listgroupHoSoFilterItems[vm.listgroupHoSoFilterselectedIndex]['count'] = serializable.total;
							}

							vm.xem_them = 'Xem thêm 8+ bản ghi';
							if (!serializable.data) {
								vm.xem_them = 'Tổng số ( ' + serializable.total + ' ) bản ghi'
							}
							vm.viewmore = false;

							$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
								if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
								} else {
									$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
								}
							});
							console.log(vm.chapThuanKhaiThacTableItems);
						})
						.catch(function (error) {
							console.log(error);
							vm.chapThuanKhaiThacTableItems = [

							];

						});
						return false; 
					},
					toDetailGiayPhep: function (item) {

						var vm = this;
						vm.stepModel = null;

						var url = '/o/rest/v2/dossiers/'+item.dossierId;

						axios.get(url, config).then(function (response) {
							var serializable = response.data;

							vm.detailModel = serializable;
							window.scrollBy(0, -99999);
						})
						.catch(function (error) {
							console.log(error);

						});
						return false; 
					},
					_paggingChapThuanKhaiThacTable: function() {
						this._inichapThuanKhaiThacTable(false);
					},
					_nextChapThuanKhaiThacTable: function() {

					},
					_previousChapThuanKhaiThacTable: function() {

					}
				}
			},