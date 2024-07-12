package com.example.kmmbalances.domain.model

data class Autoridad(
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