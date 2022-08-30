package com.syoon.bookie.network

import retrofit2.http.GET
import retrofit2.http.Query

interface BookApi {
    //http://book.interpark.com/api/search.api?key=interpark&query=%EC%82%BC%EA%B5%AD%EC%A7%80

    @GET("/api/search.api?output=json")
    suspend fun getBooks(
        @Query("key") apiKey: String,
        @Query("query") search: String
    )

    @GET("/api/bestSeller.api?output=json&categotyId=100")
    suspend fun getBestSellerBooks(
        @Query("key") apiKey: String
    )
}