package com.example.kmmbalances.domain.model

data class Contador(
    val nombre:String,
    val apellido:String,
    val nroDocumento:String,
    val tipoDocumento:String,
    val nroFiscal:String,
    val tomo:String,
    val folio:String,
    val fechaInformeAuditorExt:String,
    val nroLegalInfoAudExt:String,
    val observaciones:String,
    val opinion:String,
    var esSocioEstudio:Boolean,
    val tomoEstudio:String,
    val folioEstudio:String
)
