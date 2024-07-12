package com.example.kmmbalances.di

import com.example.kmmbalances.data.remote.BusquedaService
import com.example.kmmbalances.data.remote.DataSource
import com.example.kmmbalances.data.repository.FindForCorrelativoOrCuilRepositoryImp
import com.example.kmmbalances.domain.repository.FindCorrelativoOrCuilRepository
import com.example.kmmbalances.domain.usecases.GetFindCorrelativoOrCuilUseCase
import org.koin.dsl.module

private val dataModule = module {
    single { BusquedaService() }
    single { DataSource(get()) }
    single<FindCorrelativoOrCuilRepository> { FindForCorrelativoOrCuilRepositoryImp(get()) }
}


private val domainModule = module {
    single { GetFindCorrelativoOrCuilUseCase(get()) }
}

private val sharedModules = listOf(domainModule, dataModule)


fun getSharedModules() = sharedModules