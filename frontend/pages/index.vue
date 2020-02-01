<template>
  <default-container>
    <div>
      <page-title-container>도서 관리 프로그램</page-title-container>
      <main-info-container></main-info-container>
      <margin-box>
        전체 장서 수 - {{totals}}
      </margin-box>
      <nav-button-container></nav-button-container>
    </div>
  </default-container>
</template>

<script>
  import DefaultContainer from '../components/DefaultContainer'
  import PageTitle from '../components/PageTitle'
  import SubTitle from '../components/SubTitle'
  import MarginBox from '../components/MarginBox'
  import MainInfoContainer from '../components/MainInfoContainer';
  import PageTitleContainer from '../components/PageTitleContainer';
  import NavButtonContainer from '../components/NavButtonContainer';

  export default {
    data: () => ({
      totals: 0,
    }),

    components: {
      PageTitleContainer,
      MainInfoContainer,
      DefaultContainer,
      NavButtonContainer,
      PageTitle,
      SubTitle,
      MarginBox,
    }
  }
</script>

