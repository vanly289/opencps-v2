<!-- TODO paymentViewJX template one page view List detail template -->
<div id="danh_sach_hoso_table_template" class="hidden">
	<template slot="items" slot-scope="props">
		<td style="padding-top: 3px;width: 5%;" class="text-xs-center"> <v-checkbox primary hide-details v-model="props.selected" ></v-checkbox> </td>
		<td style="padding: 8px; padding-left: 0px;width: 5%;" class="text-xs-center">{{ danhSachHoSoTablepage * 8 - 8 + props.index + 1 }}</td>
		<td style="padding: 8px; width: 40%;" class="text-xs-left">
			<a href="javascript:;" @click.prevent.stop="toDetailHoSo(props.item)">
				{{ props.item.serviceName }} 
				<br>
			</a>
			{{ props.item.applicantName }} 
		</td>
		<td style="padding: 8px; width: 20%;" class="text-xs-center">
			{{ props.item.dossierIdCTN }} 
			<br v-if="props.item.dossierNo">
			{{ props.item.dossierNo }} 
		</td>
		<td style="padding: 8px; width: 20%;" class="text-xs-center">
			{{ props.item.submitDate}}
			<br v-if="props.item.submitDate">
			{{ props.item.receiveDate}}
		</td>
	</template>
</div>


