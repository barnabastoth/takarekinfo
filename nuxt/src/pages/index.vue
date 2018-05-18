<template>
  <!--<transition-->
    <!--appear-->
    <!--enter-active-class="animated zoomIn"-->
    <!--leave-active-class="animated zoomOut"-->
  <!--&gt;-->
  <q-layout>
    <q-page-container>
      <q-page  padding style="width: 700px; max-width: 90vw;">
        <q-list class="shadow-24" style="padding: 20px;">
          <q-item>
            <q-item-side icon="fa-info" inverted color="green" />
            <q-item-main>
              <q-item-tile label>Welcome back. You can make calculations here based on your real estate's data..</q-item-tile>
            </q-item-main>
          </q-item>
          <q-item v-show="hasErrors">
            <q-item-side icon="fa-danger" inverted color="green" />
            <q-item-main>
              <q-item-tile label>{{errors}}</q-item-tile>
            </q-item-main>
          </q-item>
          <br>
          <q-input float-label="Base area in square meters" v-model="realEstate.baseAreaInSquareMeters" inverted color="primary" type="text" :before="[{icon: 'fa-address-card', handler () {}}]"/>
          <br>
          <q-input float-label="Longitude" v-model="realEstate.longitude" inverted color="primary" type="text" :before="[{icon: 'fa-address-card', handler () {}}]"/>
          <br>
          <q-input float-label="Latitude" v-model="realEstate.latitude" inverted color="primary" type="text" :before="[{icon: 'fa-address-card', handler () {}}]"/>
          <br>
          <q-btn color="primary" icon-right="fa-sign-in-alt" @click="getCalculation()" label="Calculate" />
        </q-list>
      </q-page>
    </q-page-container>
  </q-layout>
  <!--</transition>-->
</template>

<style>
</style>

<script>
import AXIOS from 'axios'
export default {
  name: 'PageIndex',
  data: function () {
    return {
      hasErrors: false,
      errors: [],
      realEstate: {
        baseAreaInSquareMeters: '',
        longitude: '',
        latitude: ''
      }
    }
  },
  methods: {
    getCalculation () {
      AXIOS.post('http://localhost:8089/api/realestate/new', this.$data.realEstate)
        .then(response => {
          console.log(response)
        })
        .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>
