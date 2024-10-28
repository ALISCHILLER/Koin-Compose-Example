package com.msa.koin_compose_exmple.data.model

import androidx.room.Entity


@Entity("user")
data class User(
    val name : String
)
