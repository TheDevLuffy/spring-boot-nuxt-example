<template>
  <margin-box>
    <page-title>
      <slot></slot>
    </page-title>
    <v-btn to="/" text color="#000000">홈으로</v-btn>
  </margin-box>
</template>

<script>
  import MarginBox from '~/components/MarginBox'
  import PageTitle from '~/components/PageTitle'

  export default {
    components: {
      MarginBox,
      PageTitle,
    }
  }
</script>
