<template>

	<!-- Project Card -->
	<a-card class="card-project">
		<img
			slot="cover"
			alt="example"
			:src="cover"
		/>
		<div class="card-tag">Attraction #{{ id }}</div>
		<h5>{{ title }}</h5>
		<p>
			{{ content }}
		</p>
		<a-row type="flex" :gutter="6" class="card-footer" align="middle">
			<a-col :span="12">
				<router-link to="/manage-corporate-pass/edit-pass">
					<a-button :style="{backgroundColor: '#0C41FF', color: '#FFF'}">Edit Attraction</a-button>
				</router-link>
			</a-col>
			<!-- <a-col :span="12" class="text-right">
				<a-space :size="-12" class="avatar-chips">
					<a-avatar  size="small" v-for="(img, index) in team" :key="index" :src="img" />
				</a-space>
			</a-col> -->
		</a-row>
	</a-card>
	<!-- / Project Card -->

</template>

<script>

	export default ({
		props: {
			id: {
				type: Number,
				required: true,
			},
			title: {
				type: String,
				default: "",
			},
			content: {
				type: String,
				default: "",
			},
			cover: {
				type: String,
				default: "",
			},
			// team: {
			// 	type: Array,
			// 	default: () => [],
			// },
		},
		data() {
			return {
			}
		},
	})

</script>