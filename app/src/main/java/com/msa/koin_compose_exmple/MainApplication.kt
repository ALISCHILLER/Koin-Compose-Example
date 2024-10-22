package com.msa.koin_compose_exmple

import android.app.Application
import com.msa.koin_compose_exmple.di.appModule
import com.msa.koin_compose_exmple.di.initKoin
import com.msa.koin_compose_exmple.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainApplication :Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(this@MainApplication)
    }
}