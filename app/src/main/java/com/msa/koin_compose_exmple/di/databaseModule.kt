package com.msa.koin_compose_exmple.di

import androidx.room.Room
import com.msa.koin_compose_exmple.data.database.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

// تعریف ماژول پایگاه داده
// تعریف databaseModule
val databaseModule = module {
    // تعریف دیتابیس با استفاده از Room
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "app_database" // نام دیتابیس
        ).build()
    }

    // تعریف DAO (Data Access Object) های مورد نیاز
    single { get<AppDatabase>().userDao() }
}