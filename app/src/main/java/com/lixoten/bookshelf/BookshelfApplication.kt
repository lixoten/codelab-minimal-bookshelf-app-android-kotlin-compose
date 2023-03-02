package com.lixoten.bookshelf

import android.app.Application
import com.example.bookshelf.di.DefaultAppContainer
import com.lixoten.bookshelf.di.AppContainer

class BookshelfApplication: Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}