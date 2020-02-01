<template>
  <default-container>
    <div>
      <page-title-container>도서 관리 프로그램</page-title-container>
      <sub-title>도서 상세 조회</sub-title>
      <div>
        책 아이디 {{this.$route.params.id}}
      </div>
    </div>
  </default-container>
</template>

<script>
  import DefaultContainer from '~/components/DefaultContainer'
  import PageTitleContainer from '~/components/PageTitleContainer'
  import SubTitle from '~/components/SubTitle'

  export default {
    components: {
      DefaultContainer,
      PageTitleContainer,
      SubTitle,
    }
  }
</script>
