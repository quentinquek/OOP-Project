<!-- 
	This is the Individual Booking Page.
 -->

<template>
  <div>
    <!-- Authors Table -->
    <a-row :gutter="24" type="flex">
      <!-- Authors Table Column -->
      <a-col :span="24" class="mb-24">
        <!-- Authors Table Card -->
        <CardBookingDetails
          :data="table1Data"
          :columns="table1Columns"
        ></CardBookingDetails>
        <!-- / Authors Table Card -->
      </a-col>
      <!-- / Authors Table Column -->
    </a-row>
  </div>
</template>

<script>
// "Authors" table component.
import CardBookingDetails from "../components/Cards/CardBookingDetails";

export default {
  components: {
    CardBookingDetails,
  },
};
</script>

<style lang="scss"></style>