package com.syoon.bookie.repository

import com.syoon.bookie.model.Book
import com.syoon.bookie.model.SearchBookDto
import com.syoon.bookie.network.BookApiClient

class SearchBookRepository {

    private val api = BookApiClient.bookApi

    suspend fun getSearchBooks(apiKey: String, searchKey: String): List<SearchBookDto> {
        return api.getSearchBooks(apiKey, searchKey)
    }
}