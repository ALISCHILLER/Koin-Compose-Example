package com.msa.koin_compose_exmple.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.msa.koin_compose_exmple.data.database.dao.UserDao
import com.msa.koin_compose_exmple.data.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

}