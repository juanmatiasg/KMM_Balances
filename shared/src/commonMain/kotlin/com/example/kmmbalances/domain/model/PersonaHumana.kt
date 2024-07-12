package com.example.kmmbalances.domain.model

import kotlinx.serialization.Serializable


data class PersonaHumana(
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


