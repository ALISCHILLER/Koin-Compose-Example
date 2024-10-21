package com.msa.koin_compose_exmple.data.holder

import com.msa.koin_compose_exmple.data.repository.UserRepository


/**
 * Simple presenter - use the HelloRepository to "say" hello
 */
class UserStateHolder(private val repository: UserRepository) {

    fun sayHello(name : String) : String{
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from $this" } ?: "User '$name' not found!"
    }
}