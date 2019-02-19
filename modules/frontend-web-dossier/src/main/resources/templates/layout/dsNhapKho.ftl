<div style="width: 100%;">
	<v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> Danh sách phiếu nhập kho </div>

      <div class="layout row wrap header_tools w-100-xs">
        <div class="flex w-100-xs"></div>
        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

      </div>

    </div>

  	</v-slide-x-transition>

  	<v-slide-x-transition>
  		<v-layout row wrap class="ml-0">
  		  <v-flex xs12 sm12 class="text-xs-right">
  		  	<v-data-table
  		  	:headers="headersDSPNK"
  		  	:items="itemsDSPNK"
  		  	no-data-text="Không có dữ liệu"
  		  	hide-actions
  		  	class="table__overflow ml-0"
  		  	loading="true"
  		  	hide-actions
  		  	>
	  		  	<template slot="headers" slot-scope="props">
	  		  		<tr>
	  		  			<th v-for="header in props.headers" :key="header.text"
	  		  			:class="['column text-xs-center']" v-html="header.text"
	  		  			>
	  		  		</th>
	  		  	</tr>
	  		  	</template>
		  		<template slot="items" slot-scope="props">
		  		  	<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
		  		  		{{ pageDSPNK * 15 - 15 + props.index + 1 }}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		{{props.item.soPhieu}}
		  		  	</td>
		  		  	<td style="padding: 8px;;" class="text-xs-center">
		  		  		{{props.item.ngayNhap}}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		{{props.item.doiTuong}}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		{{props.item.trangThai}}
		  		  	</td>
		  		</template>
  			</v-data-table>
  			<v-pagination :length="lengthDSPNK" v-model="pageDSPNK" class="mt-3"></v-pagination>
  		  </v-flex>
  		</v-layout>
  	</v-slide-x-transition>
</div>