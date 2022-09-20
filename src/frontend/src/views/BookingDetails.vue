<!-- 
	This is the Individual Booking Page.
 -->

<template>
  <div>
    <a-row :gutter="24" type="flex">
      <a-col :span="24" class="mb-24">
        <CardBookingDetails
          :data="table1Data"
          :columns="table1Columns"
        ></CardBookingDetails>
      </a-col>
    </a-row>
  </div>
</template>

<script>
import CardBookingDetails from "../components/Cards/CardBookingDetails";

export default {
  components: {
    CardBookingDetails,
  },
};
</script>

<style lang="scss"></style>