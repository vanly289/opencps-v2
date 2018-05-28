<template>
	<v-container fluid grid-list-md>
		<v-layout row wrap>
			<v-flex sm3 class="pr-0">
				<v-card>
					<v-list>
						<v-list-tile key="giay_phep_van_tai_quoc_te" avatar @click="changeStateTraCuuGiayPhep('giay_phep_van_tai_quoc_te')">
							<v-list-tile-action>
								<v-icon>local_car_wash</v-icon>
							</v-list-tile-action>
							<v-list-tile-content>
								<v-list-tile-title>Giấy phép vận tải quốc tế</v-list-tile-title>
							</v-list-tile-content>
						</v-list-tile>

						<v-list-tile key="giay_phep_lien_van" avatar @click="changeStateTraCuuGiayPhep('giay_phep_lien_van')">
							<v-list-tile-action>
								<v-icon>group_work</v-icon>
							</v-list-tile-action>
							<v-list-tile-content>
								<v-list-tile-title>Giấy phép liên vận</v-list-tile-title>
							</v-list-tile-content>
						</v-list-tile>

						<v-list-tile key="van_ban_chap_thuan" avatar @click="changeStateTraCuuGiayPhep('van_ban_chap_thuan')">
							<v-list-tile-action>
								<v-icon>description</v-icon>
							</v-list-tile-action>
							<v-list-tile-content>
								<v-list-tile-title>Chấp thuận khai thác tuyến hành khách cố định</v-list-tile-title>
							</v-list-tile-content>
						</v-list-tile>
					</v-list>
				</v-card>

				<!-- <v-card>
					<v-btn block color="secondary"@click="changeStateTraCuuGiayPhep('giay_phep_van_tai_quoc_te')">
						<v-icon right dark>local_car_wash</v-icon>Giấy phép vận tải quốc tế
					</v-btn>
					<v-btn block color="secondary" @click="changeStateTraCuuGiayPhep('giay_phep_lien_van')">
						<v-icon right dark>group_work</v-icon>Giấy phép liên vận
					</v-btn>
					<v-btn block color="secondary"@click="changeStateTraCuuGiayPhep('van_ban_chap_thuan')">
						<v-icon right dark>description</v-icon>Chấp thuận khai thác tuyến hành khách cố định
					</v-btn>
				</v-card> -->
			</v-flex>
			<v-flex sm9 class="pl-0">
				<v-card style="padding-bottom: 10px;">
					<v-layout row wrap style="margin-top:8px;">
						<v-flex sm2 xs12 class="pt-2">
							<v-subheader>Tìm theo thủ tục</v-subheader>
						</v-flex>
						<v-flex sm3 xs12>
							<v-select
							:items="serviceInfos"
							v-model="serviceInfoSelect"
							item-text="serviceName"
							item-value="serviceCode"
							label="Lựa chọn thủ tục"
							clearable
							></v-select>
						</v-flex>
						<v-flex sm2 xs12 >
						  
						</v-flex>
						<v-flex sm3 xs12>
							<v-text-field
							label="Nhập từ khóa"
							v-model="keywordTraCuuGiayPhep"
							></v-text-field>
						</v-flex>
						<v-flex sm2 xs12>
							<v-btn small color="primary" @click="searchTraCuuGiayPhep()">Tìm kiếm</v-btn>
						</v-flex>
					</v-layout>
					<v-layout row wrap>
						<v-flex xs12 sm2 class="pt-2">
							<v-subheader>Cơ quan cấp phép</v-subheader>
						</v-flex>
						<v-flex xs12 sm3>
							<v-select
							:items="govAgencys"
							v-model="govAgencySelect"
							item-text="govAgencyName"
							item-value="govAgencyCode"
							label="Cơ quan cấp phép"
							clearable
							></v-select>
						</v-flex>
						<v-flex xs12 sm2 class="pt-2" v-if="stateTraCuuGiayPhep == 'van_ban_chap_thuan'">
							<v-subheader>Tuyến</v-subheader>
						</v-flex>
						<v-flex xs12 sm3 v-if="stateTraCuuGiayPhep == 'van_ban_chap_thuan'">
							<v-select
							:items="tuyens"
							v-model="tuyenSelect"
							item-text="itemName"
							item-value="itemCode"
							label="Tuyến"
							clearable
							></v-select>
						</v-flex>
					</v-layout>
					<v-layout row wrap>
						<v-flex xs12 sm2 class="pt-2">
							<v-subheader>Từ ngày</v-subheader>
						</v-flex>
						<v-flex xs12 sm3>
							<v-menu
							ref="menuTuNgay"
							:close-on-content-click="false"
							v-model="menuTuNgay"
							:nudge-right="40"
							lazy
							transition="scale-transition"
							offset-y
							full-width
							max-width="290px"
							min-width="290px"
							>
							<v-text-field
							slot="activator"
							v-model="searchTuNgay"
							persistent-hint
							prepend-icon="event"
							></v-text-field>
							<v-date-picker v-model="searchTuNgay" no-title @input="menuTuNgay = false"></v-date-picker>
						</v-menu>
					</v-flex>
					<v-flex xs12 sm2 text-right class="pt-2">
						<v-subheader>Đến ngày</v-subheader>
					</v-flex>
					<v-flex xs3 sm3>
						<v-menu
						ref="menuDenNgay"
						:close-on-content-click="false"
						v-model="menuDenNgay"
						:nudge-right="40"
						lazy
						transition="scale-transition"
						offset-y
						full-width
						max-width="290px"
						min-width="290px"
						>
						<v-text-field
						slot="activator"
						v-model="searchDenNgay"
						persistent-hint
						prepend-icon="event"
						></v-text-field>
						<v-date-picker v-model="searchDenNgay" no-title @input="menuDenNgay = false"></v-date-picker>
					</v-menu>
				</v-flex>
			</v-layout>
		</v-card>
	  		</v-flex>
		</v-layout>		
		<v-layout row wrap>
			<v-flex xs12 sm12 class="text-xs-right">
				<div v-if="stateTraCuuGiayPhep == 'giay_phep_van_tai_quoc_te'">
					<v-data-table
						:headers="giayPhepVanTaiQuocTeTableheaders"
						:items="giayPhepVanTaiQuocTeTableItems"
						hide-actions
						class="elevation-1">
						<template slot="items" slot-scope="props">
							<td style="padding: 8px; padding-left: 0px;width: 5%; " class="text-xs-center">{{ pageGiayPhepVanTaiQuocTeTable * 15 - 15 + props.index + 1 }}</td>
							<td style="padding: 8px;" class="text-xs-left">
								{{ props.item.giay_phep }} 
								<br v-if="props.item.so_giay_phep">
								{{ props.item.so_giay_phep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.ten_doanh_nghiep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.co_quan }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.hieu_luc_tu_ngay }} 
								<br v-if="props.item.hieu_luc_den_ngay">
								{{ props.item.hieu_luc_den_ngay }} 
							</td>
							<td style="padding: 8px; width: 10%;" class="text-xs-center">
								<v-btn small color="" @click="toDetailGiayPhep(props.item)">Xem</v-btn> 
							</td>
						</template>
					</v-data-table>
					<v-pagination :length="pageGiayPhepVanTaiQuocTeTableLength" v-model="pageGiayPhepVanTaiQuocTeTable"></v-pagination>
				</div>
				
				<div v-if="stateTraCuuGiayPhep == 'giay_phep_lien_van'">
					<v-data-table
						:headers="giayPhepLienVanTableheaders"
						:items="giayPhepLienVanTableItems"
						hide-actions
						class="elevation-1">
						<template slot="items" slot-scope="props">
							<td style="padding: 8px; padding-left: 0px;width: 5%; " class="text-xs-center">{{ pageGiayPhepLienVanTable * 15 - 15 + props.index + 1 }}</td>
							<td style="padding: 8px;" class="text-xs-left">
								{{ props.item.giay_phep }} 
								<br v-if="props.item.so_giay_phep">
								{{ props.item.so_giay_phep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.so_dang_ky_phuong_tien }} 
								<br v-if="props.item.ten_doanh_nghiep">
								{{ props.item.ten_doanh_nghiep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.co_quan }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.hieu_luc_tu_ngay }} 
								<br v-if="props.item.hieu_luc_den_ngay">
								{{ props.item.hieu_luc_den_ngay }} 
							</td>
							<td style="padding: 8px; width: 10%;" class="text-xs-center">
								<div class="ml-15">
									<span @click="printGiayPhep(props.item)" class="hover-pointer">
										<v-icon >print</v-icon>
									</span>
									<!-- <v-btn flat icon @click="printGiayPhep(props.item)">
										<v-icon >print</v-icon>
									</v-btn> -->
								</div>
								<div class="ml-15">
									<span @click="toDetailGiayPhep(props.item)" class="hover-pointer">
										<v-icon >visibility</v-icon>
									</span>
									<!-- <v-btn flat icon @click="toDetailGiayPhep(props.item)">
										<v-icon >visibility</v-icon>
									</v-btn> -->
								</div>
								<v-btn small color="" @click="toDetailThongTinXe(props.item)">Thông tin xe</v-btn> 
							</td>
						</template>
					</v-data-table>
					<v-pagination :length="pageGiayPhepLienVanTableLength" v-model="pageGiayPhepLienVanTable"></v-pagination>
				</div>

				<div v-if="stateTraCuuGiayPhep == 'van_ban_chap_thuan'">
					<v-data-table
						:headers="chapThuanKhaiThacTableheaders"
						:items="chapThuanKhaiThacTableItems"
						hide-actions
						class="elevation-1">
						<template slot="items" slot-scope="props">
							<td style="padding: 8px; padding-left: 0px;width: 5%; " class="text-xs-center">{{ pageChapThuanKhaiThacTable * 15 - 15 + props.index + 1 }}</td>
							<td style="padding: 8px;" class="text-xs-left">
								{{ props.item.giay_phep }} 
								<br v-if="props.item.so_giay_phep">
								{{ props.item.so_giay_phep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.ten_doanh_nghiep }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.tuyen_khai_thac }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.so_xe }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-center">
								{{ props.item.hieu_luc_tu_ngay }} 

								<br v-if="props.item.hieu_luc_tu_ngay">
								{{ props.item.hieu_luc_tu_ngay }} 
								<br v-if="props.item.hieu_luc_den_ngay">
								{{ props.item.hieu_luc_den_ngay }} 
							</td>
							<td style="padding: 8px; width: 10%;" class="text-xs-center">
								<v-btn small color="" @click="toDetailGiayPhep(props.item)">Xem</v-btn> 
							</td>
						</template>
					</v-data-table>
					<v-pagination :length="pageChapThuanKhaiThacTableLength" v-model="pageChapThuanKhaiThacTable"></v-pagination>
				</div>
			</v-flex>
		</v-layout>
	</v-container>
</template>