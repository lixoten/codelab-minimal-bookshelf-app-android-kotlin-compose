package com.lixoten.bookshelf.di


import com.lixoten.bookshelf.data.BookshelfRepository
import com.lixoten.bookshelf.network.BookshelfApi

/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val bookshelfApiService: BookshelfApi
    val bookshelfRepository: BookshelfRepository
}