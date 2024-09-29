<template>

    <v-card outlined>
        <v-card-title>
            대시보드 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '대시보드ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/대시보드/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

