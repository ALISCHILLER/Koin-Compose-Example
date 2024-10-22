package com.msa.koin_compose_exmple.di

import com.msa.koin_compose_exmple.MainApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.KoinContext
import org.koin.core.context.startKoin

fun initKoin(mainApplication: MainApplication){
    startKoin {
        androidContext(mainApplication)
        androidLogger()
        modules(
            appModule,
            networkModule,
            repositoryModule
            )
    }
}