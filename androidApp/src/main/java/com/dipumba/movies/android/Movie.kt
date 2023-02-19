package com.dipumba.movies.android

import android.app.Application
import com.dipumba.movies.android.di.appModule
import com.dipumba.movies.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}