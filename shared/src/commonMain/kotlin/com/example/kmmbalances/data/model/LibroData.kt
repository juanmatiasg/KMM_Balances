package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class LibroData(
    val tipoLibro: TipoLibroData,
    val tipoDocumento: String,
    val nombre: String,
    val numeroRubrica: String,
    val fechaRubrica: String,
    val fechaUltimaRegistracion: String,
    val folioObraTranscripcion: String,
    val folioUltimaRegistracion: String,
    var noSabeNoContesta: Boolean
)

