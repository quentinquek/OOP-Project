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
  </div>
</template>

<script>
// "Authors" table component.
import CardAuthorTable from "../components/Cards/CardBookingDetails";


export default {
  components: {
    CardAuthorTable,
  },
};
</script>

<style lang="scss"></style>