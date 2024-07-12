package com.example.kmmbalances.domain.model

data class Balance(
    val id: String,
    val caratula: Caratula,
    val archivos: List<Archivo>,
    val autoridades: List<Autoridad>,
    val estadoContable: EstadoContable,
    val libros: List<Libro>,
    val contador: Contador,
    val socios: List<Socio>,
    val presentacion: Presentacion,
    val hash: String
)