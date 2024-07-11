package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PersonaJuridicaData(
    var id:String,
    var denominacion:String,
    var jurisdiccion:String,
    var pais:String,
    var nroFiscal:String,
    var cuotas:String,
    var votos:String,
    var valorNominal:String
)

