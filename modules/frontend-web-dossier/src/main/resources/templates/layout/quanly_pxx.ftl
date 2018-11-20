<template>
  <div>
    <v-layout row wrap>
        <v-flex xs12 sm2>
        </v-flex>
        <v-flex xs12 sm8>
          <v-layout row wrap>
            <v-flex xs12 sm2 class="">
              <v-subheader class="pl-0">Kiểm kê kho phiếu </v-subheader>
            </v-flex>
            <v-flex xs12 sm4 class="mb-2">
              <v-select
                :items="doiPhongItems"
                item-text="itemName"
                item-value="itemCode"
                placeholder="Chọn đội/ phòng"
                v-model="searchDoiPhong"
                @change="changeDoiPhong()"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm6 class="mb-2 mt-3">
              <v-btn color="primary" small @click="nhapKhoAction()"><v-icon>add</v-icon> Nhập kho</v-btn>
              <v-btn color="primary" small @click="xuatKhoAction()"><v-icon>add</v-icon> Xuất kho</v-btn>
              <v-btn color="primary" small @click="dieuChuyenAction()"><v-icon>add</v-icon> Điều chuyển</v-btn>
            </v-flex>
          </v-layout>
          <v-layout row wrap>
            <v-flex xs12 sm4 class="mb-2">
              <v-text-field
                v-model="soSerial"
                placeholder="Nhập số serial"
              ></v-text-field>
            </v-flex>
            <v-flex xs12 sm3 class="mb-2">
              <v-select
                :items="mauPhoiItems"
                item-text="itemName"
                item-value="itemCode"
                placeholder="Nhập số serial"
                v-model="searchMauPhoi"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm2 class="mb-2">
              <v-select
                :items="namItems"
                placeholder="Chọn năm"
                v-model="searchNam"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm3 class="mb-2 mt-3">
              <v-btn color="primary" small @click="xemPhieuXX()"><v-icon>search</v-icon> Xem</v-btn>
              <v-btn color="primary" small @click="xuatExel()"><v-icon>import_export</v-icon> Xuất Exel</v-btn>
            </v-flex>
          </v-layout>
        </v-flex>
        <v-flex xs12 sm2 class="mb-2">
        </v-flex>
    </v-layout>
    <v-layout row wrap>
      <v-flex xs12 sm12 class="text-xs-right">
        <div v-if="loadingPxx" class="text-xs-center">
          <v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
        </div>
        <v-data-table
          :headers="headersPxx"
          :items="itemsPxx"
          no-data-text="Không có dữ liệu"
          hide-actions
          class="danhSachHoSoTable__class ml-2 mr-2"
          loading="true"
          v-else
        >
        <template slot="items" slot-scope="props">
            <td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
              {{ pagePxx * 15 - 15 + props.index + 1 }}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              <v-btn color="primary" small @click="kiemKeAction(props.item)">props.item.btnText</v-btn>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item.mauPhoi}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.nam}}
            </td>
            <td style="padding: 8px;;" class="text-xs-center">
                {{props.item.soSerial}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.tuSo}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.denSo}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.nhapKho}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.xuatKho}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.tonTrenSo}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.kiemKe}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.chenhLechTang}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.chenhLechGiam}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
                {{props.item.ngayKiemKe}}
                <br v-if="props.item.lyDo" />
                {{props.item.lyDo}}
            </td>
          </template>
          <!-- <template slot="footer">
            <td colspan="100%">
              <strong>This is an extra footer</strong>
            </td>
          </template> -->
        </v-data-table>
        <v-pagination :length="lengthPxx" v-model="pagePxx" class="mr-3 mt-3"></v-pagination>
      </v-flex>
    </v-layout>
  </div>
</template>
