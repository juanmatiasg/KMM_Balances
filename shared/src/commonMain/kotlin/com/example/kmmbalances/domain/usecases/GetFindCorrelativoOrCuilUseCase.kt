package com.example.kmmbalances.domain.usecases

import com.example.kmmbalances.domain.model.Busqueda
import com.example.kmmbalances.domain.repository.FindCorrelativoOrCuilRepository

class GetFindCorrelativoOrCuilUseCase(private val useCase:FindCorrelativoOrCuilRepository) {
    suspend fun getCuilOrCorrelativo(correlativo:String):Busqueda = useCase.findCorrelativoOrCuil(correlativo)
}