<!-- 
	This is the tables page, it uses the dashboard layout in: 
	"./layouts/Dashboard.vue" .
 -->

<template>
	<div>

		<!-- Authors Table -->
		<a-row :gutter="24" type="flex">

			<!-- Authors Table Column -->
			<a-col :span="24" class="mb-24">

				<!-- Authors Table Card -->
				<CardAuthorTable
					:data="table1Data"
					:columns="table1Columns"
				></CardAuthorTable>
				<!-- / Authors Table Card -->

			</a-col>
			<!-- / Authors Table Column -->

		</a-row>
		<!-- / Authors Table -->

		<!-- Projects Table -->
		<!-- <a-row :gutter="24" type="flex"> -->

			<!-- Projects Table Column -->
			<!-- <a-col :span="24" class="mb-24"> -->

				<!-- Projects Table Column -->
				<!-- <CardProjectTable2
					:data="table2Data"
					:columns="table2Columns"
				></CardProjectTable2> -->
				<!-- / Projects Table Column -->

			<!-- </a-col> -->
			<!-- / Projects Table Column -->

		<!-- </a-row> -->
		<!-- / Projects Table -->

	</div>
</template>

<script>

	// "Authors" table component.
	import CardAuthorTable from '../components/Cards/CardAuthorTable' ;

	// "Projects" table component.
	import CardProjectTable2 from '../components/Cards/CardProjectTable2' ;
	
	// "Authors" table list of columns and their properties.
	const table1Columns = [
		{
			title: 'Booking ID',
			dataIndex: 'booking',
			scopedSlots: { customRender: 'booking' },
		},
		{
			title: 'Place',
			dataIndex: 'place',
			scopedSlots: { customRender: 'place' },
		},
		{
			title: 'Number of Pass',
			dataIndex: 'pass',
			class: 'text-muted',
		},
		{
			title: 'Visit Date',
			dataIndex: 'visitDate',
			class: 'text-muted',
		},
		{
			title: 'Booking Status',
			dataIndex: 'status',
			scopedSlots: { customRender: 'status' },
		},
		{
			title: '',
			scopedSlots: { customRender: 'editBtn' },
			width: 50,
		},
	];

	// "Authors" table list of rows and their properties.
	const table1Data = [
		{
			key: '1',
			booking: 'B1',
			place: 'Singapore Zoo',
			pass: '2',
			status: true,
			visitDate: '23/04/18',
		},
		{
			key: '2',
			booking: 'B2',
			place: 'River Safari',
			pass: '1',
			status: false, 
			visitDate: '23/12/20',
		}
		
	];
	
	// "Projects" table list of columns and their properties.
	const table2Columns = [
		{
			title: 'COMPANIES',
			dataIndex: 'company',
			scopedSlots: { customRender: 'company' },
			width: 300,
		},
		{
			title: 'BUDGET',
			dataIndex: 'budget',
			class: 'font-semibold text-muted',
		},
		{
			title: 'STATUS',
			dataIndex: 'status',
			class: 'font-semibold text-muted text-sm',
		},
		{
			title: 'COMPLETION',
			scopedSlots: { customRender: 'completion' },
			dataIndex: 'completion',
		},
		{
			title: '',
			scopedSlots: { customRender: 'editBtn' },
			width: 50,
		},
	];

	// "Projects" table list of rows and their properties.
	const table2Data = [
		{
			key: '1',
			company: {
				name: 'Spotify Version',
				logo: 'images/logos/logo-spotify.svg',
			},
			status: "working",
			budget: '$14,000',
			completion: 60,
		},
		{
			key: '2',
			company: {
				name: 'Progress Track',
				logo: 'images/logos/logo-atlassian.svg',
			},
			status: "working",
			budget: '$3,000',
			completion: 10,
		},
		{
			key: '3',
			company: {
				name: 'Jira Platform Errors',
				logo: 'images/logos/logo-slack.svg',
			},
			status: "done",
			budget: 'Not Set',
			completion: {
				status: 'success',
				value: 100,
			},
		},
		{
			key: '4',
			company: {
				name: 'Launch new Mobile App',
				logo: 'images/logos/logo-spotify.svg',
			},
			status: "canceled",
			budget: '$20,600',
			completion: {
				status: 'exception',
				value: 50,
			},
		},
		{
			key: '5',
			company: {
				name: 'Web Dev',
				logo: 'images/logos/logo-webdev.svg',
			},
			status: "working",
			budget: '$4,000',
			completion: 80,
		},
		{
			key: '6',
			company: {
				name: 'Redesign Online Store',
				logo: 'images/logos/logo-invision.svg',
			},
			status: "canceled",
			budget: '$2,000',
			completion: {
				status: 'exception',
				value: 0,
			},
		},
	];

	export default ({
		components: {
			CardAuthorTable,
			CardProjectTable2,
		},
		data() {
			return {
				// Associating "Authors" table data with its corresponding property.
				table1Data: table1Data,

				// Associating "Authors" table columns with its corresponding property.
				table1Columns: table1Columns,

				// Associating "Projects" table data with its corresponding property.
				table2Data: table2Data,

				// Associating "Projects" table columns with its corresponding property.
				table2Columns: table2Columns,
			}
		},
	})

</script>

<style lang="scss">
</style>