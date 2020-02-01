<template>
  <h1 class="title">
    <slot></slot>
  </h1>
</template>

<style>
  .title {
    font-family: "Quicksand", "Source Sans Pro", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif; /* 1 */
    display: block;
    font-weight: 400;
    font-size: 40px;
    color: #35495e;
    letter-spacing: 1px;
  }
</style>
