package com.example.kmmbalances.domain.model

data class Caratula(
    var email:String,
    val fechaInicio: String,
    val fechaDeCierre: String,
    val fecha: String,
    val entidad: Entidad
)