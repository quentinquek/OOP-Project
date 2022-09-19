<template>

	<!-- Authors Table Card -->
	<a-card :bordered="false" class="header-solid h-full" :bodyStyle="{padding: 0,}">
		<template #title>
			<a-row type="flex" align="middle">
				<a-col :span="24" :md="12">
					<h5 class="font-semibold m-0">My Bookings</h5>
				</a-col>
				<a-col :span="24" :md="12" style="display: flex; align-items: center; justify-content: flex-end">
					<a-radio-group v-model="authorsHeaderBtns" size="small">
						<a-radio-button value="all">Active</a-radio-button>
						<a-radio-button value="online">Inactive</a-radio-button>
					</a-radio-group>
				</a-col>
			</a-row>
		</template>
		<a-table :columns="columns" :data-source="data" :pagination="false">

			<template slot="booking" slot-scope="booking">
				<div class="table-avatar-info">
					<div class="avatar-info">
						<p>{{ booking }}</p>
					</div>
				</div>
			</template>

			<template slot="place" slot-scope="place">
				<div class="author-info">
					<p class="m-0">{{ place }}</p>
				</div>
			</template>

			<template slot="status" slot-scope="status">
				<a-tag class="tag-status" :class="status ? 'ant-tag-green' : 'ant-tag-red'">
					{{ status ? "Activate" : "Inactive" }}
				</a-tag>
			</template>

			<template slot="editBtn" slot-scope="row">
				<a-button type="primary" ghost :data-id="row.key" class="btn-edit">
					Edit
				</a-button>
			</template>

		</a-table>
	</a-card>
	<!-- / Authors Table Card -->

</template>

<script>

	export default ({
		props: {
			data: {
				type: Array,
				default: () => [],
			},
			columns: {
				type: Array,
				default: () => [],
			},
		},
		data() {
			return {
				// Active button for the "Authors" table's card header radio button group.
				authorsHeaderBtns: 'all',
			}
		},
	})

</script>