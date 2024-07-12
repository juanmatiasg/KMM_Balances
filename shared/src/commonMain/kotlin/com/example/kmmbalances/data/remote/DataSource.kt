package com.example.kmmbalances.data.remote

class DataSource(private val busquedaService: BusquedaService) {
    suspend fun findForCorrelativoOrCuil(correlativo:String) = busquedaService.findForCorrelativoOrCuil(correlativo)
}