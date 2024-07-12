package com.example.kmmbalances.android.di

import com.example.kmmbalances.android.viewmodel.FindCorrelativoOrCuilViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var androidModule = module {
    viewModel { FindCorrelativoOrCuilViewModel(get()) }
}

