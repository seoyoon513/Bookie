package com.syoon.bookie.model

data class Book(
    val itemId: Int,
    val title: String,
    val description: String,
    val pubDate: String,
    val coverSmallUrl: String,
    val coverLargeUrl: String,
    val customerReviewRank: Int,
    val author: String,
    val link: String,
    val mobileLink: String,
)

data class SearchBookDto(
    val title: String,
    val books: List<Book>
)

data class BestSellerDto(
    val title: String,
    val books: List<Book>
)
