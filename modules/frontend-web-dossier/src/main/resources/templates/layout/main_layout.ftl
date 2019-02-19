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
					<v-card-text class="pt-0">
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm12>
                  <table class="table table-bordered">
                    <thead style="border-top: 1px solid #ecdbdb;">
                      <tr>
                        <th rowspan="2">Mã hàng</th>
                        <th rowspan="2">Tên hàng</th>
                        <th rowspan="2">DVT</th>
                        <th colspan="3">
                          Số lượng
                        </th>
                        <th rowspan="2" class="text-xs-center">
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

      <v-dialog v-model="popUpDieuCHuyen" persistent fullscreen transition="dialog-bottom-transition" :overlay=false>
        <v-card>
          <!-- <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Chi tiết kiểm kê</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpDieuCHuyen = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar> -->
          <v-toolbar dark color="primary" height="50" class="mb-0">
            <v-btn icon @click.native="popUpDieuCHuyen = false" dark>
              <v-icon>close</v-icon>
            </v-btn>
            <v-toolbar-title style="font-size: 117%;">
              <span v-if="stateAddPhieu === 'dieu_chuyen'">Phiếu điều chuyển</span>
              <span v-else-if="stateAddPhieu === 'xuat_kho'">Phiếu xuất kho</span>
              <span v-else>Phiếu nhập kho</span>
            </v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn dark flat @click.native="popUpDieuCHuyen = false">Thoát</v-btn>
              <!-- <v-btn dark flat @click.native="luuPhieu()">Lưu phiếu</v-btn> -->
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text class="pt-0">
            <v-container grid-list-md>
              <v-layout wrap>
                <v-flex xs12 sm2 class="mb-2">
                </v-flex>
                <v-flex xs12 sm2>
                  <v-select
                    v-if="stateAddPhieu === 'xuat_kho'"
                    :items="hoSoItems"
                    v-model="hoSo"
                    clearable
                    placeholder="Chọn hồ sơ"
                    class="pt-0"
                  ></v-select>
                  <v-select
                    v-if="stateAddPhieu === 'dieu_chuyen'"
                    :items="coSoInItems"
                    v-model="coSoIn"
                    clearable
                    placeholder="Chọn tổ tổng hợp, đơn vị khai thác"
                    placeholder
                    class="pt-0"
                  ></v-select>
                </v-flex>
                <v-flex xs12 sm2>
                  <v-btn color="primary" @click="chonChungTu()" v-if="stateAddPhieu === 'dieu_chuyen'" small>Chọn chứng từ</v-btn>
                  <v-btn color="primary" @click="chonHoSo(hoSo)" v-else-if="stateAddPhieu === 'xuat_kho'" small>Chọn hồ sơ</v-btn>
                  <!-- <v-btn color="primary" @click="" v-else small>Chọn hồ sơ...</v-btn> -->
                </v-flex>
                <v-flex xs12 sm6>
                  
                </v-flex>
                <v-flex xs12 sm8 style="border: 1px solid #ccc; position: relative;" class="mb-2">
                  <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Thông tin chung</span> <br />
                  <v-layout row wrap>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                      <label class="pt-2">Đối tượng</label>
                    </v-flex>
                    <v-flex xs12 sm4 class="py-0">
                      <v-select
                        :items="doiTuongItems"
                        item-text="itemName"
                        item-value="itemCode"
                        clearable
                        v-model="thongTinPhieu.doiTuong"
                        class="pt-0"
                      ></v-select>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                      <label class="pt-2">Cơ sở sản xuất</label>
                    </v-flex>
                    <v-flex xs12 sm4 class="py-0">
                      <!-- <v-text-field
                        v-model="thongTinPhieu.coSoSanXuat"
                        clearable
                        class="pt-0"
                      ></v-text-field> -->
                      <v-select
                        :items="coSoSanXuatItems"
                        item-text="itemName"
                        item-value="itemCode"
                        clearable
                        v-model="thongTinPhieu.coSoSanXuat"
                        class="pt-0"
                      ></v-select>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0" v-if="stateAddPhieu === 'xuat_kho'">
                      <label class="pt-2">Địa chỉ</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0" v-if="stateAddPhieu === 'xuat_kho'">
                      <v-text-field
                      v-model="thongTinPhieu.diaChi"
                      clearable
                      class="pt-0"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0" v-if="stateAddPhieu === 'xuat_kho'">
                      <label class="pt-2">Địa chỉ xưởng</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0" v-if="stateAddPhieu === 'xuat_kho'">
                      <v-text-field
                      v-model="thongTinPhieu.diaChiXuong"
                      clearable
                      class="pt-0"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0" v-if="stateAddPhieu === 'dieu_chuyen' || stateAddPhieu === 'nhap_kho'">
                      <label class="pt-2">Người giao</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0" v-if="stateAddPhieu === 'dieu_chuyen' || stateAddPhieu === 'nhap_kho'">
                      <v-text-field
                      v-model="thongTinPhieu.nguoiGiao"
                      clearable
                      class="pt-0"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                      <label class="pt-2">Diễn giải</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0">
                      <v-text-field
                      v-model="thongTinPhieu.dienGiai"
                      clearable
                      class="pt-0"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                      <label class="pt-2">Tham chiếu</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="mb-2 py-0">
                      <label class="pt-2">{{thongTinPhieu.maThamChieu}}</label>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm4 style="border: 1px solid #ccc; position: relative;" class="mb-2">
                  <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Chứng từ</span>
                  <v-layout row wrap class="mt-2">
                    <v-flex xs12 sm5 class="text-xs-right py-0">
                      <label class="pt-2">Số phiếu nhập</label>
                    </v-flex>
                    <v-flex xs12 sm7 class="mb-2 py-0">
                      <v-text-field
                        v-model="thongTinPhieu.soPhieuNhap"
                        clearable
                        class="pt-0"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm5 class="text-xs-right py-0">
                      <label class="pt-2">Ngày nhập</label>
                    </v-flex>
                    <v-flex xs12 sm7 class="py-0">
                      <v-menu
                        ref="menuNN"
                        :close-on-content-click="false"
                        v-model="menuNgayNhap"
                        :nudge-right="40"
                        :return-value.sync="date"
                        lazy
                        transition="scale-transition"
                        offset-y
                        full-width
                        min-width="290px"
                        >
                        <v-text-field
                        slot="activator"
                        v-model="thongTinPhieu.ngayNhap"
                        prepend-icon="event"
                        clearable
                        class="pt-0"
                        readonly
                        ></v-text-field>
                        <v-date-picker v-model="dateNgayNhap" @input="parseNgayNhap()"></v-date-picker>
                      </v-menu>
                    </v-flex>
                    
                    <v-flex xs12 sm5>
                      <v-btn color="primary" @click="chonChungTu()" v-if="stateAddPhieu === 'dieu_chuyen'" small>Chọn chứng từ</v-btn>
                      <v-btn color="primary" @click="chonHoSo(hoSo)" v-else-if="stateAddPhieu === 'xuat_kho'" small>Chọn hồ sơ</v-btn>
                    </v-flex>
                    <v-flex xs12 sm7>
                      <v-select
                      v-if="stateAddPhieu === 'xuat_kho'"
                      :items="hoSoItems"
                      v-model="hoSo"
                      clearable
                      placeholder="Chọn hồ sơ"
                      class="pt-0"
                      ></v-select>
                      <v-select
                      v-if="stateAddPhieu === 'dieu_chuyen'"
                      :items="coSoInItems"
                      v-model="coSoIn"
                      clearable
                      placeholder="Chọn tổ tổng hợp, đơn vị khai thác"
                      placeholder
                      class="pt-0"
                      ></v-select>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm12 class="mt-3 px-0">
                  <v-data-table
                    v-bind:headers="headersDSSP"
                    v-bind:items="dsGCNItems"
                    v-model="selected"
                    item-key="name"
                    no-data-text="Không có dữ liệu"
                    select-all
                    class="table__overflow"
                    hide-actions
                    v-if="stateAddPhieu === 'dieu_chuyen' || stateAddPhieu === 'nhap_kho'"
                  >
                    <template slot="headers" slot-scope="props">
                      <tr>
                        <th style="width: 25px;" class="my-0 py-0">
                          <v-checkbox
                          primary
                          hide-details
                          @click.native="toggleAll"
                          :input-value="props.all"
                          :indeterminate="props.indeterminate"
                          class="my-0 py-0"
                          ></v-checkbox>
                        </th>
                        <th v-for="header in props.headers" :key="header.text"
                        :class="['column text-xs-center']"
                        >
                        {{ header.text }}
                        </th>
                      </tr>
                    </template>
                    <template slot="items" slot-scope="props">
                      <td>
                        <v-checkbox
                          primary
                          hide-details
                          v-model="props.selected"
                        ></v-checkbox>
                      </td>
                      <td @click="suaVatTu(props.item)" class="pt-2">{{ props.item.soSerial }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.tuSo }}</td>
                      <td class="text-xs-left pt-2">{{ props.item.denSo }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.soLuong }}</td>
                      <!-- <td class="text-xs-right pt-2">{{ props.item.soLuong }}</td>
                      <td class="text-xs-right pt-2">{{ props.item.donGia }}</td>
                      <td class="text-xs-right pt-2">{{ props.item.thanhtien }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.ngayXuatXuong }}</td>
                      <td class="text-xs-center pt-2"><span @click="chiTietGCN(props.item)">Chi tiết</span></td> -->
                    </template>
                    <template slot="footer">
                      <tr style="height: 35px;">
                        <td colspan="2"></td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-left"></td>
                        <!-- <td class="text-xs-right"></td>
                        <td class="text-xs-right"></td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-right" class="pt-2">{{ tongTien }}</td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-center"></td> -->
                      </tr>
                    </template>
                  </v-data-table>

                  <v-data-table
                    v-bind:headers="headersXuatKhoDSSP"
                    v-bind:items="dsGCNXuatKhoItems"
                    v-model="selected"
                    item-key="name"
                    no-data-text="Không có dữ liệu"
                    select-all
                    class="table__overflow"
                    hide-actions
                    v-else
                  >
                    <template slot="headers" slot-scope="props">
                      <tr>
                        <th style="width: 25px;" class="my-0 py-0">
                          <v-checkbox
                          primary
                          hide-details
                          @click.native="toggleAll"
                          :input-value="props.all"
                          :indeterminate="props.indeterminate"
                          class="my-0 py-0"
                          ></v-checkbox>
                        </th>
                        <th v-for="header in props.headers" :key="header.text"
                        :class="['column text-xs-center']"
                        >
                        {{ header.text }}
                        </th>
                      </tr>
                    </template>
                    <template slot="items" slot-scope="props">
                      <td>
                        <v-checkbox
                          primary
                          hide-details
                          v-model="props.selected"
                        ></v-checkbox>
                      </td>
                      <td @click="suaVatTu(props.item)" class="pt-2">{{ props.item.soGCN }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.nhanHieu }}</td>
                      <td class="text-xs-left pt-2">{{ props.item.soLoai }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.loaiPhuongTien }}</td>
                      <td class="text-xs-right pt-2">{{ props.item.soLuong }}</td>
                      <td class="text-xs-right pt-2">{{ props.item.donGia }}</td>
                      <td class="text-xs-right pt-2">{{ props.item.thanhtien }}</td>
                      <td class="text-xs-center pt-2">{{ props.item.ngayXuatXuong }}</td>
                      <td class="text-xs-center pt-2"><span @click="chiTietGCN(props.item)">Chi tiết</span></td>
                    </template>
                    <template slot="footer">
                      <tr style="height: 35px;">
                        <td colspan="2"></td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-left"></td>
                        <td class="text-xs-right"></td>
                        <td class="text-xs-right"></td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-right" class="pt-2">{{ tongTien }}</td>
                        <td class="text-xs-center"></td>
                        <td class="text-xs-center"></td>
                      </tr>
                    </template>
                  </v-data-table>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn color="primary" small @click="addGCN()" v-if="stateAddPhieu === 'dieu_chuyen' || stateAddPhieu === 'nhap_kho'"><v-icon>add</v-icon> Thêm dòng</v-btn>
                  <v-btn color="primary" small @click="deleteVatTuSelect()" v-if="stateAddPhieu === 'dieu_chuyen' || stateAddPhieu === 'nhap_kho'"><v-icon>delete</v-icon> Xóa dòng</v-btn>
                  <v-btn color="primary" small @click="luuPhieu(1)"><v-icon>save</v-icon> Lưu phiếu</v-btn>
                  <v-btn color="primary" small @click="luuPhieu(2)"><v-icon>done</v-icon> Xác nhận</v-btn>
                  <v-btn color="primary" small @click="popUpDieuCHuyen = false"><v-icon>save</v-icon> Thoát</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpChiTietPhieu" persistent max-width="950px">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Chi tiết phiếu</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpChiTietPhieu = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <v-container grid-list-md>
              <v-layout wrap>
                <!-- <v-flex xs12 sm12>
                  <v-layout row wrap>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">CSSX: </label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ thongTinPhieu.coSoSanXuat }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Nhà máy sản xuất</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ thongTinPhieu.nhaMaySanXuat }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Giấy chứng nhận</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.giayChungNhan }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Loại phương tiện</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.loaiPhuongTien }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Nhãn hiệu</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.nhanHieu }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Số loại</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.soLoai }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Xuất xưởng từ ngày</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.tuNgay }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">đến ngày</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.denNgay }}</span>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm12>
                  <div id="chiTietPhieuTable"></div>
                </v-flex> -->
                <v-flex xs12 sm12 class="text-cs-right">
                  <span style="color: blue;" v-if="stateNumberSerial === 3">Thừa</span>
                  <span style="color: blue;" v-else-if="stateNumberSerial === 2">Đủ</span>
                  <span style="color: blue;" v-else>Thiếu</span>
                </v-flex>
                <v-flex xs12 sm12>
                  <div id="dsSoSerial"></div>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="saveSoSerial()">Lưu lại</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpAddGCN" persistent max-width="800px">
				<v-card>
					<v-toolbar dark color="primary" height="50">
						<div class="text-bold">Thêm giấy chứng nhận</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpAddGCN = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
					<v-card-text class="py-0">
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số serial</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-model="detailGCN.soSerial_add"
                    class="pt-0"
                    clearable
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Từ số</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-model="detailGCN.tuSo_add"
                    class="pt-0"
                    clearable
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Đến số</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-model="detailGCN.denSo_add"
                    class="pt-0"
                    clearable
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số lượng</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-model="detailGCN.soLuong_add"
                    clearable
                    class="pt-0"
                  ></v-text-field>
                </v-flex>
                <!-- <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số lượng</label>
                </v-flex>
                <v-flex xs12 sm4>
                  <v-text-field
                    v-model="detailGCN.soLuong_add"
                    class="pt-0"
                    clearable
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Đơn giá</label>
                </v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-model="detailGCN.donGia_add"
                    clearable
                    class="pt-0"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Ngày xuất xưởng</label>
                </v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-menu
                    ref="menuNC"
                    :close-on-content-click="false"
                    v-model="menuNgayXuatXuong_add"
                    :nudge-right="40"
                    :return-value.sync="date"
                    lazy
                    transition="scale-transition"
                    offset-y
                    full-width
                    min-width="290px"
                    >
                      <v-text-field
                        slot="activator"
                        v-model="detailGCN.ngayXuatXuong_add"
                        prepend-icon="event"
                        class="pt-0"
                        clearable
                        readonly
                      ></v-text-field>
                      <v-date-picker v-model="dateNgayXuatXuong_add" @input="parseNgayXuatXuong_add()"></v-date-picker>
                  </v-menu>
                </v-flex>
                <v-flex xs12 sm6 class="mb-2">

                </v-flex> -->
                <v-flex xs12 sm12 class="mt-3 text-xs-center mb-2">
                  <v-btn color="primary" small @click="addRowVatTu()"><v-icon>add</v-icon> Thêm</v-btn>
                  <v-btn color="primary" small @click="popUpAddGCN = false"> Hủy bỏ</v-btn>
                </v-flex>
							</v-layout>
						</v-container>
					</v-card-text>
				</v-card>
			</v-dialog>
      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'tra_cuu_hoso' && !detailPage">

          <#include "tra_cuu_hoso.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_phuong_tien' && !detailPage">

          <#include "tra_cuu_phuong_tien.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'doanh_nghiep_trong_nuoc' && !detailPage">

          <#include "tra_cuu_thong_tin_doanh_nghiep.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'co_so_nuoc_ngoai' && !detailPage ">

          <#include "dsCoSoNuocNgoai.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'quan_ly_pxx' && !detailPage">

          <#include "quanly_pxx.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_nhap_kho' && !detailPage">

          <#include "dsNhapKho.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_xuat_kho' && !detailPage">

          <#include "dsXuatKho.ftl">

        </div>

        <div class="layout wrap" v-else-if="!detailPage">

          <#include "danh_sach_hoso.ftl">

        </div>
      </v-slide-x-transition>

	  <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView === 'doanh_nghiep_trong_nuoc'">

          <#include "regist_detail.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView === 'co_so_nuoc_ngoai'">
          <#include "addCoSoNuocNgoai.ftl">
        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView !== 'doanh_nghiep_trong_nuoc' && stageFilterView !== 'co_so_nuoc_ngoai' && stageFilterView !== 'quan_ly_pxx' && stageFilterView !== 'ds_nhap_kho' && stageFilterView !== 'ds_xuat_kho'">

          <#include "dossier_detail.ftl">

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
