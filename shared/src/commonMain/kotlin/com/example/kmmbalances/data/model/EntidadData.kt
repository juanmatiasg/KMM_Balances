package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EntidadData(
    val razonSocial:String,
    val tipoEntidad:String,
    val domicilio:String,
    val sedeSocialInscripta:Boolean,
    val correlativo:String
)
