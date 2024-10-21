package com.msa.koin_compose_exmple.ui.screen

import androidx.lifecycle.ViewModel
import com.msa.koin_compose_exmple.data.repository.UserRepository

class HomeViewModel(
    private val repository: UserRepository
) :ViewModel(){


    fun sayHello(name : String) : String{
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from $this" } ?: "User '$name' not found!"
    }

}