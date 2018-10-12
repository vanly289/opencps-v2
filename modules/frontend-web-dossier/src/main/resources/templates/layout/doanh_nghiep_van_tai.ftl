<div>
	<v-layout row wrap>
		<v-flex xs12 sm12>
			<v-flex xs12 sm3>

			</v-flex>
			<v-flex xs12 sm6 style="display: inline-flex; ">
				<v-text-field
				placeholder="Tìm kiếm theo mã/tên doanh nghiệp/GCN đăng ký kinh doanh"
				v-model="keywordsSearch"
				style="width : 350px;"
				@keyup.enter="searchKeyWordQLVT"
				clearable
				></v-text-field>
				<v-btn small :disabled="loadingDanhSachHoSoTable" class="mt-3" color="primary" click.native="searchKeyWord">
					Tìm kiếm
				</v-btn>
				<v-btn small :disabled="loadingDanhSachHoSoTable" class="mt-3" color="primary" click.native="dialogSearch = !dialogSearch">
					Tìm kiếm nâng cao
				</v-btn>
			</v-flex>
			<v-flex xs12 sm3>

			</v-flex>
		</v-flex>
		<v-flex xs12 sm12>
			<div class="row-header">
				<div class="background-triangle-big"> Tên thủ tục </div>
				<div class="layout row wrap header_tools row-blue">

					<div class="flex xs7 sm9 solo pl-4 text-ellipsis">

						Danh sách doanh nghiệp vận tải

					</div>
					<div class="flex xs5 sm3 text-right" style="margin-left: auto;">

						<#-- <v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native.prevent.stop="undoDetailPage()">
							<v-icon class="mr-2">undo</v-icon>
							Quay lại
						</v-btn> -->
					</div>
				</div>
			</div>
		</v-flex>
		<v-flex xs12 sm12>
			<v-data-table
			:headers="giayPhepVanTaiQuocTeTableheaders"
			:items="giayPhepVanTaiQuocTeTableItems"
			hide-actions
			id="tableGiayPhepVanTaiQuocTe"
			class="elevation-1">
			<template slot="items" slot-scope="props">
				<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">{{ pageGiayPhepVanTaiQuocTeTable * 15 - 15 + props.index + 1 }}</td>
				<td style="padding: 8px;" class="text-xs-left">
					{{ props.item.licenceName }} 
					<br v-if="props.item.licenceNo">
					{{ props.item.licenceNo }} 
				</td>
				<td style="padding: 8px; width: 15%;" class="text-xs-left">
					{{ props.item.applicantName }} 
				</td>
				<td style="padding: 8px; width: 15%;" class="text-xs-left">
					{{ props.item.govAgencyName }} 
				</td>
				<td style="padding: 8px; width: 15%;" class="text-xs-left">
					{{ props.item.validFrom }} 
					<br v-if="props.item.validUntil">
					{{ props.item.validUntil }} 
				</td>
				<td style="padding: 8px; width: 10%;" class="text-xs-center">
					<v-btn class="ml-0 mr-0 btn__info" flat icon style="color: #14BEF0;" @click="printGiayPhep(props.item)">
						<v-icon style="font-size: 16px;">print</v-icon>
					</v-btn> 
					
					<v-btn class="ml-0 mr-0 btn__info" flat icon style="color: #14BEF0;" @click="toDetailGiayPhep(props.item)">
						<v-icon style="font-size: 16px;">visibility</v-icon>
					</v-btn>
				</td>
			</template>
		</v-data-table>
		<v-pagination :length="pageGiayPhepVanTaiQuocTeTableLength" v-model="pageGiayPhepVanTaiQuocTeTable" class="pt-3"></v-pagination>
		</v-flex>
	</v-layout>
</div>