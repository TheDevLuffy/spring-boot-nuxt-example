<template>
  <default-container>
    <div>
      <page-title-container>도서 관리 프로그램</page-title-container>
      <sub-title>
        목록 조회
      </sub-title>
      <margin-box>
        <v-row dense>
          <v-col cols="12">
            <v-card
              v-for="(book, i) in books"
              :key="i"
              color="#000000"
              dark
              width="400px"
            >
              <v-card-title class="headline">{{book.title}}</v-card-title>
              <v-card-subtitle>{{book.description}}</v-card-subtitle>
              <v-card-actions>
                <v-btn text v-on:click="descBtnClickHandler(book.id)">자세히 보기</v-btn>
              </v-card-actions>
            </v-card>
          </v-col>
        </v-row>
      </margin-box>
    </div>
  </default-container>
</template>

<script>
  import DefaultContainer from '~/components/DefaultContainer'
  import PageTitleContainer from '~/components/PageTitleContainer'
  import SubTitle from '~/components/SubTitle'
  import MarginBox from '~/components/MarginBox'

  export default {
    data: () => ({
      books: [
        {
          id: '1',
          title: '객체 지향의 사실과 오해',
          description: '객체의 사실과 오해를 해결한다. 우아한 형제들 개발자 조영호님이 그 오해를 풀어주는 책.객체의 사실과 오해를 해결한다. 우아한 형제들 개발자 조영호님이 그 오해를 풀어주는 책.객체의 사실과 오해를 해결한다. 우아한 형제들 개발자 조영호님이 그 오해를 풀어주는 책.',
        }
      ],
      page: 1,
    }),

    components: {
      DefaultContainer,
      PageTitleContainer,
      SubTitle,
      MarginBox,
    },

    methods: {
      descBtnClickHandler(id) {
        this.$router.push(`/books/${id}`)
      }
    }
  }
</script>

