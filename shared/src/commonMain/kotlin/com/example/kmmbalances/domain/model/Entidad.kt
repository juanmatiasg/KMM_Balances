package com.example.kmmbalances.domain.model

data class Entidad(
    val razonSocial: String,
    val tipoEntidad: String,
    val domicilio: String,
    val sedeSocialInscripta: Boolean,
    val correlativo: String
)