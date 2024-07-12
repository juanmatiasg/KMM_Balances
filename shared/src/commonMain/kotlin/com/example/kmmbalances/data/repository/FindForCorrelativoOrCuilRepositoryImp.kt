package com.example.kmmbalances.data.repository

import com.example.kmmbalances.data.remote.DataSource
import com.example.kmmbalances.domain.repository.FindCorrelativoOrCuilRepository

class FindForCorrelativoOrCuilRepositoryImp(private val dataSource: DataSource):FindCorrelativoOrCuilRepository {
    override suspend fun findCorrelativoOrCuil(correlativo: String) =  dataSource.findForCorrelativoOrCuil(correlativo)
}