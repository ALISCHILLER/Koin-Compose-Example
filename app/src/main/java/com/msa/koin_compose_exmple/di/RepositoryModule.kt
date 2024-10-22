package com.msa.koin_compose_exmple.di

import com.msa.koin_compose_exmple.data.repository.UserRepository
import com.msa.koin_compose_exmple.data.repository.UserRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<UserRepository> { UserRepositoryImpl() }
}