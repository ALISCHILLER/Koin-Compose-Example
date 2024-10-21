package com.msa.koin_compose_exmple.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.msa.koin_compose_exmple.data.DefaultData
import com.msa.koin_compose_exmple.data.holder.UserStateHolder
import org.koin.androidx.compose.koinViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.activity.compose.setContent
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.get
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    App()
}

@Composable
fun App(){
    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center){
        val userName = DefaultData.DEFAULT_USER.name
        FactoryInject(userName)
        ViewModelInject(userName)
    }
}

@Composable
fun FactoryInject(userName : String, presenter: UserStateHolder = get()){
    Text(text = presenter.sayHello(userName), modifier = Modifier.padding(8.dp))
}

@Composable
fun ViewModelInject(userName : String, viewModel: HomeViewModel = koinViewModel()){
    Text(text = viewModel.sayHello(userName), modifier = Modifier.padding(8.dp))
}