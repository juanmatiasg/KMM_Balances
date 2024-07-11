package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ArchivoData(
    var id:String,
    val categoria:String,
    val hash:String,
    val nombreArchivo:String,
    val tamano:Long,
    val contentType:String
)