package com.example.kmmbalances.domain.model

import kotlinx.serialization.Serializable


data class PersonaJuridica(
    var id:String,
    var denominacion:String,
    var jurisdiccion:String,
    var pais:String,
    var nroFiscal:String,
    var cuotas:String,
    var votos:String,
    var valorNominal:String
)

