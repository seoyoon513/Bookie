package com.syoon.bookie.network

import com.syoon.bookie.model.BestSellerDto
import com.syoon.bookie.model.SearchBookDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApi {
    //http://book.interpark.com/api/search.api?key=interpark&query=%EC%82%BC%EA%B5%AD%EC%A7%80

    @GET("/api/search.api?output=json")
    suspend fun getSearchBooks(
        @Query("key") apiKey: String,
        @Query("query") searchKey: String
    ): List<SearchBookDto>

    @GET("/api/bestSeller.api?output=json&categoryId=100")
    suspend fun getBestSellerBooks(
        @Query("key") apiKey: String
    ): List<BestSellerDto>
}