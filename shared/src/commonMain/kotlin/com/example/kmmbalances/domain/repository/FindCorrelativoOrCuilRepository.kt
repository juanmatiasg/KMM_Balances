package com.example.kmmbalances.domain.repository

import com.example.kmmbalances.domain.model.Busqueda

interface FindCorrelativoOrCuilRepository {
    suspend fun findCorrelativoOrCuil(correlativo:String):Busqueda
}