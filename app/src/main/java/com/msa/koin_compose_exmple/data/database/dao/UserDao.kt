package com.msa.koin_compose_exmple.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.msa.koin_compose_exmple.data.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM user")
    suspend fun getAllUsers(): List<User>
}