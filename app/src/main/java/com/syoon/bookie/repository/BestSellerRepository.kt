package com.syoon.bookie.repository

import com.syoon.bookie.model.BestSellerDto
import com.syoon.bookie.network.BookApiClient


class BestSellerRepository {

    private val api = BookApiClient.bookApi

    suspend fun getBestSellerBooks(apiKey: String): List<BestSellerDto> {
        return api.getBestSellerBooks(apiKey)
    }
}