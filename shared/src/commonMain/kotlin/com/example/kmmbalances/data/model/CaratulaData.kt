package com.example.kmmbalances.data.model

import com.example.kmmbalances.domain.model.Entidad
import kotlinx.serialization.Serializable

@Serializable
data class CaratulaData(
    val email:String,
    val fechaInicio:String,
    val fechaCierre:String,
    val fecha:String,
    val entidad: EntidadData,

)
