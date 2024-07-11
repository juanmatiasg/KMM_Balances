package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PersonaHumanaData(
    val id:String,
    val nombre:String,
    val apellido:String,
    val nroDocumento:String,
    val tipoDocumento:String,
    val nroFiscal:String,
    var cuotas:String,
    var votos:String,
    var esFirmante:Boolean,
    var valorNominal:String
)


