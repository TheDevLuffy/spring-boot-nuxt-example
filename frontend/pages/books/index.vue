<template>
  <default-container>
    <div>
      <page-title-container>도서 관리 프로그램</page-title-container>
      <sub-title>
        도서 등록
      </sub-title>
      <margin-box>
        <v-col>
          <v-text-field v-model="book.image" label="도서 이미지 Url"></v-text-field>
          <v-text-field v-model="book.title" label="도서 제목"></v-text-field>
          <v-text-field v-model="book.author" label="작가"></v-text-field>
          <v-text-field v-model="book.publisher" label="출판사"></v-text-field>
          <v-text-field v-model="book.isbn" label="ISBN"></v-text-field>
          <v-text-field v-model="book.description" label="책 정보"></v-text-field>
        </v-col>
      </margin-box>
      <margin-box v-if="response.message" style="color: red;">
        {{response.message}}
      </margin-box>
      <margin-box>
        <v-btn color="#000000" dark width="100%" @click="bookEnrollBtnClickHandler">책 등록</v-btn>
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
      book: {
        image: '',
        title: '',
        author: '',
        publisher: '',
        isbn: '',
        description: '',
      },
      response: {
        message: null,
      }
    }),

    components: {
      DefaultContainer,
      PageTitleContainer,
      SubTitle,
      MarginBox,
    },

    methods: {
      bookEnrollBtnClickHandler () {
        console.log(this.book)
      }
    }
  }
</script>








