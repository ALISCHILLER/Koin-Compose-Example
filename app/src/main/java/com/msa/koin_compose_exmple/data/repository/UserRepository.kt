package com.msa.koin_compose_exmple.data.repository

import com.msa.koin_compose_exmple.data.model.User

interface UserRepository {
    fun findUser(name : String): User?
    fun addUsers(users : List<User>)
}