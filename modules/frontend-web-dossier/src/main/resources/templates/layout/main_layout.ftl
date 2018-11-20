  <!-- TODO paymentViewJX template one page -->
  <div id="dossierViewJX_form_template" class="hidden">
    <div class="jx-content-wrap">
      <v-layout row justify-center>
			<v-dialog v-model="popUpChiTietKiemKe" persistent max-width="800px">
				<v-card>
					<v-toolbar dark color="primary" height="50">
						<div class="text-bold">Chi tiết kiểm kê</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpChiTietKiemKe = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
					<v-card-text>
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm12>
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th rowspan="2">Mã hàng</th>
                        <th rowspan="2">Tên hàng</th>
                        <th rowspan="2">DVT</th>
                        <th colspan="3">
                          Số lượng
                        </th>
                        <th rowspan="2">
                          Xử lý
                        </th>
                      </tr>
                      <tr>
                        <th>
                          Theo số kế toán
                        </th>
                        <th>
                          Theo kiểm kê
                        </th>
                        <th>
                          Chênh lệch
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr v-for="(item, index) in chiTietKiemKeItems" :key="index">
                        <td style="padding: 8px;" class="text-xs-left">{{item.maHang}}</td>
                        <td style="padding: 8px;" class="text-xs-left">{{item.tenHang}}</td>
                        <td style="padding: 8px;" class="text-xs-left">{{item.dvt}}</td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.theoSoKeToan < 0 ? 'red' : ''}">{{Math.abs(item.theoSoKeToan)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.theoKiemKe < 0 ? 'red' : ''}">{{Math.abs(item.theoKiemKe)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.chenhLech < 0 ? 'red' : ''}">{{Math.abs(item.chenhLech)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right">{{item.xuLy}}</td>
                      </tr>
                      <tr>
                        <td style="padding: 8px; text-decoration: underline;">
                          Số dòng: {{chiTietKiemKeItems.length}}
                        </td>
                        <td colspan="2">

                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.theoSoKeToan < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.theoSoKeToan)}}</span>
                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.theoKiemKe < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.theoKiemKe)}}</span>
                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.chenhLech < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.chenhLech)}}</span>
                        </td>
                        <td>
                        </td>
                      </tr>
                    </tbody>
                  </table>
								</v-flex>
							</v-layout>
						</v-container>
					</v-card-text>
				</v-card>
			</v-dialog>

      <v-dialog v-model="popUpDieuCHuyen" persistent max-width="950px">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Chi tiết kiểm kê</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpDieuCHuyen = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <v-container grid-list-md>
              <v-layout wrap>
                <v-flex xs12 sm2 class="mb-2">
                  <span v-if="stateAddVatTu === 'dieu_chuyen'">Phiếu nhập kho</span>
                  <span v-else-if="stateAddVatTu === 'xuat_kho'">Phiếu xuất kho</span>
                  <span v-else>Phiếu nhập kho</span>
                </v-flex>
                <v-flex xs12 sm2>
                  <v-select
                    :items="dieuChuyenItems"
                    v-model="dieuChuyen"
                  ></v-select>
                </v-flex>
                <v-flex xs12 sm2>
                  <v-btn color="primary" @click="chonChungTu()" v-if="stateAddVatTu === 'dieu_chuyen'" small>Chọn chứng từ...</v-btn>
                  <v-btn color="primary" @click="monDaBan()" v-else-if="stateAddVatTu === 'xuat_kho'" small>Chọn chứng từ...</v-btn>
                  <v-btn color="primary" @click="" v-else small>Chọn chứng từ...</v-btn>
                </v-flex>
                <v-flex xs12 sm6>
                  
                </v-flex>
                <v-flex xs12 sm8 style="border: 1px solid #ccc; position: relative;" class="mb-2">
                  <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Thông tin chung</span> <br />
                  <v-layout row wrap>
                    <v-flex xs12 sm3>
                      <v-subheader>Đối tượng</v-subheader>
                    </v-flex>
                    <v-flex xs12 sm4 class="mb-2">
                      <v-select
                        :items="doiTuongItems"
                        item-text="itemName"
                        item-value="itemCode"
                        v-model="doiTuong"
                      ></v-select>
                    </v-flex>
                    <v-flex xs12 sm5 class="mb-2">
                      <v-text-field
                        v-model="doiTuong1"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm3 class="mb-2">
                      <v-subheader>Người giao</v-subheader>
                    </v-flex>
                    <v-flex xs12 sm9 class="mb-2">
                      <v-text-field
                      v-model="nguoiGiao"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm3 class="mb-2">
                      <v-subheader class="pt-3">Diễn giải</v-subheader>
                    </v-flex>
                    <v-flex xs12 sm9 class="mb-2">
                      <v-text-field
                      v-model="dienGiai"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm12 class="mb-2">
                      <v-subheader>Tham chiếu</v-subheader>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm4 style="border: 1px solid #ccc; position: relative;" class="mb-2">
                  <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Chứng từ</span>
                  <v-layout row wrap class="mt-2">
                    <v-flex xs12 sm5 class="mb-2">
                      <v-subheader>Số phiếu nhập</v-subheader>
                    </v-flex>
                    <v-flex xs12 sm7 class="mb-2">
                      <v-text-field
                        v-model="soPhieuNhap"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm5 class="mb-2">
                      <v-subheader>Ngày nhập</v-subheader>
                    </v-flex>
                    <v-flex xs12 sm7 class="mb-2">
                      <v-text-field
                        v-model="ngayNhap"
                      ></v-text-field>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-data-table
                    v-bind:headers="headersDSSP"
                    v-bind:items="dsspItems"
                    v-model="selected"
                    item-key="name"
                    no-data-text="Không có dữ liệu"
                    select-all
                    class="danhSachHoSoTable__class"
                  >
                    <template slot="headerCell" slot-scope="props">
                      <v-tooltip bottom>
                        <span slot="activator">
                          {{ props.header.text }}
                        </span>
                        <span>
                          {{ props.header.text }}
                        </span>
                      </v-tooltip>
                    </template>
                    <template slot="items" slot-scope="props">
                      <td>
                        <v-checkbox
                          primary
                          hide-details
                          v-model="props.selected"
                        ></v-checkbox>
                      </td>
                      <td @click="suaVatTu(props.item)">{{ props.item.manvl }}</td>
                      <td class="text-xs-center">{{ props.item.nguyenvatlieu }}</td>
                      <td class="text-xs-left">{{ props.item.kho }}</td>
                      <td class="text-xs-center">{{ props.item.donvitinh }}</td>
                      <td class="text-xs-right">{{ props.item.soluong }}</td>
                      <td class="text-xs-right">{{ props.item.dongia }}</td>
                      <td class="text-xs-center">{{ props.item.nhapkho }}</td>
                      <td class="text-xs-right">{{ props.item.thanhtien }}</td>
                      <td class="text-xs-center">{{ props.item.hansudung }}</td>
                    </template>
                    <template slot="footer">
                      <td colspan="2"></td>
                      <td class="text-xs-center"></td>
                      <td class="text-xs-left"></td>
                      <td class="text-xs-center"></td>
                      <td class="text-xs-right"></td>
                      <td class="text-xs-right"></td>
                      <td class="text-xs-center"></td>
                      <td class="text-xs-right">{{ tongTien }}</td>
                      <td class="text-xs-center"></td>
                    </template>
                  </v-data-table>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn color="primary" small @click="addVatTu()"><v-icon>add</v-icon> Thêm dòng</v-btn>
                  <v-btn color="primary" small @click="deleteVatTuSelect()"><v-icon>delete</v-icon> Xóa dòng</v-btn>
                  <v-btn color="primary" small @click="luuPhieu()"><v-icon>save</v-icon> Lưu phiếu</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpAddVatTu" persistent max-width="800px">
				<v-card>
					<v-toolbar dark color="primary" height="50">
						<div class="text-bold">Thêm vật tư</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpAddVatTu = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
					<v-card-text>
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Mã vật tư</v-subheader>
								</v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.maVatTu_add"
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Tên vật tư</v-subheader>
								</v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.tenVatTu_add"
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Kho</v-subheader>
								</v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.kho_add"
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Đơn vị tính</v-subheader>
								</v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.donViTinh_add"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Số lượng</v-subheader>
                </v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.soluong_add"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Đơn giá</v-subheader>
                </v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.donGia_add"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm2 class="mb-2">
                  <v-subheader>Hạn sử dụng</v-subheader>
                </v-flex>
                <v-flex xs12 sm4 class="mb-2">
                  <v-text-field
                    v-model="detailVatTu.hanSuDung_add"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm6 class="mb-2">

                </v-flex>
                <v-flex xs12 sm12 class="mt-3 text-xs-center mb-2">
                  <v-btn color="primary" small @click="addRowVatTu()"><v-icon>add</v-icon> Thêm</v-btn>
                  <v-btn color="primary" small @click="popUpAddVatTu = false"> Hủy bỏ</v-btn>
                </v-flex>
							</v-layout>
						</v-container>
					</v-card-text>
				</v-card>
			</v-dialog>
      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'tra_cuu_hoso' && !detailPage && !detailRegistPage ">

          <#include "tra_cuu_hoso.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_phuong_tien' && !detailPage && !detailRegistPage ">

          <#include "tra_cuu_phuong_tien.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_thong_tin_doanh_nghiep' && !detailRegistPage ">

          <#include "tra_cuu_thong_tin_doanh_nghiep.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView !== 'tra_cuu' && !detailPage && !detailRegistPage ">

          <#include "danh_sach_hoso.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'quan_ly_pxx' && !detailPage && !detailRegistPage ">

          <#include "danh_sach_hoso.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage">

          <#include "dossier_detail.ftl">

        </div>
      </v-slide-x-transition>

	  <v-slide-x-transition>
        <div class="layout wrap" v-if="detailRegistPage">

          <#include "regist_detail.ftl">

        </div>
      </v-slide-x-transition>

      <v-fab-transition>
        <v-btn color="primary" dark fixed bottom right fab ripple v-show="offsetTop > 200"
        v-on:click.native="onScrollTop">
          <v-icon>keyboard_arrow_up</v-icon>
        </v-btn>
      </v-fab-transition>

    </div>
  </div>
