package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class AutoridadData(
    val id:String,
    val nombre:String,
    val apellido:String,
    val nroDocumento:String,
    val tipoDocumento:String,
    val nroFiscal:String,
    val cargo:String,
    val esFirmante:Boolean,
    val estaVigente:Boolean
)

