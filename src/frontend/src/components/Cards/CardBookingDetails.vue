<template>
  <!-- Billing Information Card -->
  <a-card
    :bordered="false"
    class="header-solid h-full"
    :bodyStyle="{ paddingTop: 0, paddingBottom: '16px' }"
  >
    <template #title>
      <h6 class="font-semibold m-0">Booking Details</h6>
    </template>
    <a-row :gutter="[24, 24]">
      <a-col :span="24">
        <a-card :bordered="false" class="card-billing-info">
          <div class="col-info">
            <a-descriptions :column="1">
              <a-descriptions-item label="Booking ID">
                B1
              </a-descriptions-item>
              <a-descriptions-item label="Attraction">
                Singapore Zoo
              </a-descriptions-item>
               <a-descriptions-item label="Number of Pass">
                1
              </a-descriptions-item>
              <a-descriptions-item label="Visit Date">
                12/9/2022
              </a-descriptions-item>
              <a-descriptions-item label="Booked On">
                12/9/2022
              </a-descriptions-item>
              <a-descriptions-item label="Card Allocated">
                Physical
              </a-descriptions-item>
               <a-descriptions-item label="Card Collection Details">
                 Physical pass must be collected at the General Office, kindly refer to your confirmation email for more details.
              </a-descriptions-item>
            </a-descriptions>
          </div>
          <div class="col-action">
            <a-button type="danger" size="small">
              <svg
                width="16"
                height="16"
                viewBox="0 0 20 20"
                fill="none"
                xmlns="http://www.w3.org/2000/svg"
              >
                <path
                  fill-rule="evenodd"
                  clip-rule="evenodd"
                  d="M9 2C8.62123 2 8.27497 2.214 8.10557 2.55279L7.38197 4H4C3.44772 4 3 4.44772 3 5C3 5.55228 3.44772 6 4 6L4 16C4 17.1046 4.89543 18 6 18H14C15.1046 18 16 17.1046 16 16V6C16.5523 6 17 5.55228 17 5C17 4.44772 16.5523 4 16 4H12.618L11.8944 2.55279C11.725 2.214 11.3788 2 11 2H9ZM7 8C7 7.44772 7.44772 7 8 7C8.55228 7 9 7.44772 9 8V14C9 14.5523 8.55228 15 8 15C7.44772 15 7 14.5523 7 14V8ZM12 7C11.4477 7 11 7.44772 11 8V14C11 14.5523 11.4477 15 12 15C12.5523 15 13 14.5523 13 14V8C13 7.44772 12.5523 7 12 7Z"
                  fill="#FFFFFF"
                />
              </svg>
              <span class="text-white">Cancel Booking</span>
            </a-button>
          </div>
        </a-card>
      </a-col>
    </a-row>

    <a-progress :percent="50" />
    <a-row :gutter="[24, 24]">
      <a-col :span="24">
        <a-card :bordered="false" class="card-billing-info">
          <div class="col-info">
            <a-descriptions :column="1">
              <a-descriptions-item label="Card Status">
                Collected
              </a-descriptions-item>
            </a-descriptions>
          </div>
        </a-card>
      </a-col>
    </a-row>
  </a-card>

  
</template>

<script>
export default {
  data() {
    return {};
  },
};
</script>