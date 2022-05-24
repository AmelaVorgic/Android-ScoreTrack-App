package com.example.lv4_vorgic.di

import com.example.lv4_vorgic.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<MainViewModel>{MainViewModel()}
}