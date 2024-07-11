package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class SocioData(
    val personasHumanas:ArrayList<PersonaHumanaData>,
    val personaJuridicaData:ArrayList<PersonaJuridicaData>
)