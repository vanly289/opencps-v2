<div>
	<v-layout row wrap>
	  <v-flex xs12 sm12>
	  	<div class="mb-3">
	  		<v-chip label color="orange" text-color="white" class="mr-2">
	  			Doanh nghiệp vận tải
	  		</v-chip>
	  		<v-chip label color="orange" text-color="white" class="mr-2">
	  			Phương tiện
	  		</v-chip>
	  		<v-chip label color="orange" text-color="white" class="mr-2">
	  			Giấy phép vận tải quốc tế
	  		</v-chip>
	  		<v-chip label color="orange" text-color="white" class="mr-2">
	  			Giấy phép liên vận
	  		</v-chip>
	  		<v-chip label color="orange" text-color="white" class="mr-2">
	  			Phù hiệu liên vận
	  		</v-chip>
	  	</div>
	  </v-flex>
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
	    
	  </v-flex>
	</v-layout>
</div>