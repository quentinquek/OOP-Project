<template>
    	<!-- Attraction Card -->
		<a-card :bordered="false" class="header-solid h-full mb-24" :bodyStyle="{paddingTop: '20px'}">
			<template #title>
                <a-row type="flex" :gutter="[24,24]">
                    <a-col>
                        <h4 class="font-bold">All Corporate Attractions</h4>	
                    </a-col>
                    <a-col>
                        <router-link to="manage-corporate-pass/create-attraction">
                            <a-button :style="{backgroundColor: '#0C41FF', color: '#FFF'}">Create Attraction</a-button>	
                        </router-link>	
                    </a-col>
                </a-row>
			</template>

			<a-row type="flex" :gutter="[24,24]" align="stretch">

				<!-- Project Column -->
				<a-col :span="24" :md="12" :xl="8" v-for="(project, index) in projects" :key="index">
					<CardProject
						:id="project.id"
						:title="project.title"
						:content="project.content"
						:cover="project.cover"
					></CardProject>
				</a-col>
				<!-- / Project Column -->

			</a-row>
		</a-card>
		<!-- / Projects Card -->
</template>

<script>

	import CardPlatformSettings from "../components/Cards/CardPlatformSettings"
	import CardProfileInformation from "../components/Cards/CardProfileInformation"
	import CardConversations from "../components/Cards/CardConversations"
	import CardProject from "../components/Cards/CardProject"

	// Conversation's list data.
	const conversationsData = [
		{
			id: "1",
			title: "Sophie B.",
			code: "Hi! I need more information…",
			avatar: "images/face-3.jpg",
		},
		{
			id: "2",
			title: "Anne Marie",
			code: "Awesome work, can you…",
			avatar: "images/face-4.jpg",
		},
		{
			id: "3",
			title: "Ivan",
			code: "About files I can…",
			avatar: "images/face-5.jpeg",
		},
		{
			id: "4",
			title: "Peterson",
			code: "Have a great afternoon…",
			avatar: "images/face-6.jpeg",
		},
		{
			id: "5",
			title: "Nick Daniel",
			code: "Hi! I need more information…",
			avatar: "images/face-2.jpg",
		},
	] ;

	// Project cards data
	const projects = [
		{
			id: 1,
			title: "Singapore Zoo",
			content: "As Uber works through a huge amount of internal management turmoil.",
			cover: "images/home-decor-3.jpeg",
			team: [
				"images/face-1.jpg",
				"images/face-4.jpg",
				"images/face-2.jpg",
				"images/face-3.jpg",
			],
		},
		{
			id: 2,
			title: "Universal Studio",
			content: "Music is something that every person has his or her own specific opinion about.",
			cover: "images/home-decor-2.jpeg",
			team: [
				"images/face-1.jpg",
				"images/face-4.jpg",
				"images/face-2.jpg",
				"images/face-3.jpg",
			],
		},
		{
			id: 3,
			title: "River Safari",
			content: "Different people have different taste, and various types of music, Zimbali Resort.",
			cover: "images/home-decor-1.jpeg",
			team: [
				"images/face-1.jpg",
				"images/face-4.jpg",
				"images/face-2.jpg",
				"images/face-3.jpg",
			],
		},
        {
			id: 4,
			title: "Adventure Cove",
			content: "Different people have different taste, and various types of music, Zimbali Resort.",
			cover: "images/home-decor-1.jpeg",
			team: [
				"images/face-1.jpg",
				"images/face-4.jpg",
				"images/face-2.jpg",
				"images/face-3.jpg",
			],
		},
        {
			id: 5,
			title: "Trick Eye Museum",
			content: "Different people have different taste, and various types of music, Zimbali Resort.",
			cover: "images/home-decor-1.jpeg",
			team: [
				"images/face-1.jpg",
				"images/face-4.jpg",
				"images/face-2.jpg",
				"images/face-3.jpg",
			],
		},
	] ;

	export default ({
		components: {
			CardPlatformSettings,
			CardProfileInformation,
			CardConversations,
			CardProject,
		},
		data() {
			return {
				// Active button for the "User Profile" card's radio button group.
				profileHeaderBtns: 'overview',

				// Associating Conversation's list data with its corresponding property.
				conversationsData,

				// Project cards data
				projects,
			}
		},
	})

</script>

<style lang="scss">
</style>