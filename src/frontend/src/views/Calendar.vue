<template>
  <a-calendar :value="date" @select="onSelect" @panelChange="onPanelChange">
    <ul class="events" slot="dateCellRender" slot-scope="value">
      <li v-for="item in getListData(value)" :key="item.content">
        <a-badge :status="item.type" :text="item.content" />
      </li>
    </ul>
    <template slot="monthCellRender" slot-scope="value">
      <div v-if="getMonthData(value)" class="notes-month">
        <section>{{getMonthData(value)}}</section>
        <span>Backlog number</span>
      </div>
    </template>
  </a-calendar>
</template>

<script>
import { defineComponent, ref } from 'vue';
import moment, { Moment } from 'moment';

export default {
  methods: {
    getListData(value) {
      let listData;
      switch (value.date()) {
        case 8:
          listData = [
            { type: 'warning', content: 'This is warning event.' },
            { type: 'success', content: 'This is usual event.' },
          ]; break;
        case 10:
          listData = [
            { type: 'warning', content: 'This is warning event.' },
            { type: 'success', content: 'This is usual event.' },
            { type: 'error', content: 'This is error event.' },
          ]; break;
        case 15:
          listData = [
            { type: 'warning', content: 'This is warning event' },
            { type: 'success', content: 'This is very long usual event。。....' },
            { type: 'error', content: 'This is error event 1.' },
            { type: 'error', content: 'This is error event 2.' },
            { type: 'error', content: 'This is error event 3.' },
            { type: 'error', content: 'This is error event 4.' },
          ]; break;
        default:
      }
      return listData || [];
    },

    getMonthData(value) {
      if (value.month() === 8) {
        return 1394;
      }
    },
    setup() {
    const date = ref(moment('2022-09-25'));
    const selectedValue = ref(moment('2022-09-25'));
    const date1 = ref(moment('2022-09-25'));

    const onSelect = value => {
      date.value = value;
      selectedValue.value = value;
    };

    const onPanelChange = value => {
      date.value = value;
    };
    return {
      date,
      selectedValue,
      date1,
      onSelect,
      onPanelChange,
    };
  },
  }
}
</script>

<style scoped>
.events {
  list-style: none;
  margin: 0;
  padding: 0;
}
.events .ant-badge-status {
  overflow: hidden;
  white-space: nowrap;
  width: 100%;
  text-overflow: ellipsis;
  font-size: 12px;
}
.notes-month {
  text-align: center;
  font-size: 28px;
}
.notes-month section {
  font-size: 28px;
}
</style>