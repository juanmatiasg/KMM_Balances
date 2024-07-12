package com.example.kmmbalances.domain.model
data class Libro(
    val tipoLibro: TipoLibro,
    val tipoDocumento: String,
    val nombre: String,
    val numeroRubrica: String,
    val fechaRubrica: String,
    val fechaUltimaRegistracion: String,
    val folioObraTranscripcion: String,
    val folioUltimaRegistracion: String,
    var noSabeNoContesta: Boolean
)