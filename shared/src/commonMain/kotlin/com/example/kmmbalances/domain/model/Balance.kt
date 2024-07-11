package com.example.kmmbalances.domain.model

data class Balance(
    val id: String,
    val caratula: Caratula,
    val archivos: List<Archivo>? = null,
    val autoridades: List<Autoridad>? = null,
    val estadoContable: EstadoContable? = null,
    val libros: List<Libro>? = null,
    val contador: Contador? = null,
    val socios: List<Socio>? = null,
    val presentacion: Presentacion? = null,
    val hash: String? = null
)