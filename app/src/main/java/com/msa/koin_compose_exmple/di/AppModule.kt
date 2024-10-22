package com.msa.koin_compose_exmple.di

import com.msa.koin_compose_exmple.data.holder.UserStateHolder
import com.msa.koin_compose_exmple.data.repository.UserRepository
import com.msa.koin_compose_exmple.data.repository.UserRepositoryImpl
import com.msa.koin_compose_exmple.ui.screen.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module{
    factoryOf(::UserStateHolder)
    viewModelOf(::HomeViewModel)
}