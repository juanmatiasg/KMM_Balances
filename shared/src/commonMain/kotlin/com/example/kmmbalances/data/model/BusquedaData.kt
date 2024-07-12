package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class BusquedaData(
    var id:String?,
    var razonSocial:String?,
    var nroCorrelativo:String?,
    var cuit:String?,
    var tipoEntidad:String?,
    var estado:String?
)

