package com.example.bookshelf.di

import com.lixoten.bookshelf.data.BookshelfRepository
import com.lixoten.bookshelf.data.DefaultBookshelfRepository
import com.lixoten.bookshelf.network.BookshelfApi
import com.lixoten.bookshelf.di.AppContainer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class DefaultAppContainer : AppContainer {
//    private val json = Json {
//        ignoreUnknownKeys = true
//        explicitNulls = false
//    }
    override val bookshelfApiService: BookshelfApi by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
//            .addConverterFactory(json
//                    .asConverterFactory("application/json".toMediaType()))
            .baseUrl(BookshelfApi.BASE_URL)
            .build()
            .create()
    }

    override val bookshelfRepository: BookshelfRepository by lazy {
        DefaultBookshelfRepository(bookshelfApiService)
    }
}