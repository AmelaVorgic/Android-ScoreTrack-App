package com.example.lv4_vorgic

import android.app.Application
import com.example.lv4_vorgic.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(
                viewModelModule
            )
        }
    }
}