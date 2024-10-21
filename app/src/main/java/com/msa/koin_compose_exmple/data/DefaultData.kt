package com.msa.koin_compose_exmple.data

import com.msa.koin_compose_exmple.data.model.User

object DefaultData {
    val DEFAULT_USER = User("Koin")
    val DEFAULT_USERS = listOf(DEFAULT_USER)
}