package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class RubroPatrimonioNetoData(
    val codigo:String,
    val denominacion:String,
    var importe:Double
)