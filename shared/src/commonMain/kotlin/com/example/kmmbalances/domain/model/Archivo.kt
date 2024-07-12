package com.example.kmmbalances.domain.model

data class Archivo(
    var id:String,
    val categoria:String,
    val hash:String,
    val nombreArchivo:String,
    val tamano:Long,
    val contentType:String
)