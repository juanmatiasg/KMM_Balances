package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PresentacionData(
    val fecha:String,
    val binarioPdf:Byte
)