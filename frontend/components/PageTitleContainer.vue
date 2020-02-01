<template>
  <margin-box>
    <page-title>
      <slot></slot>
    </page-title>
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
