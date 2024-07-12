package com.example.kmmbalances.domain.model

import com.example.kmmbalances.data.model.PersonaHumanaData
import com.example.kmmbalances.data.model.PersonaJuridicaData

data class Socio(
    val personasHumanas:ArrayList<PersonaHumana>,
    val personaJuridicaData:ArrayList<PersonaJuridica>
)