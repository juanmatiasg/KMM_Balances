package com.example.kmmbalances.android

import android.app.Application
import com.example.kmmbalances.android.di.androidModule
import com.example.kmmbalances.di.getSharedModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BalancesApp:Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@BalancesApp)
            modules(androidModule + getSharedModules())
        }
    }
}