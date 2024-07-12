package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class BusquedadResponse(
    var result:BusquedaData,
    var isSuccess:String,
    var message:String,
)