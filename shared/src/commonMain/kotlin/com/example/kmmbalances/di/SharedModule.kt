package com.example.kmmbalances.di

import org.koin.dsl.module

private val dataModule = module {
   /* single { TramiteService() }
    single { EntidadService() }
    single { ViewService() }
    single { DataSource(get(), get(), get()) }
    single<TramiteRepository> { TramiteRepositoryImp(get()) }
    single<EntidadRepository> { EntidadRepositoryImpl(get()) }
    single<ViewRepository> { ViewRepositoryImpl(get()) }*/
}


private val domainModule = module {
    /*single { GetTramiteUseCase(get()) }
    single { GetEntidadUseCase(get()) }
    single { GetViewUseCase(get()) }*/
}

private val sharedModules = listOf(domainModule, dataModule)


fun getSharedModules() = sharedModules