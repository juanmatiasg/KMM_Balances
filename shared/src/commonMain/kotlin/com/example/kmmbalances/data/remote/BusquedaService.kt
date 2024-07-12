package com.example.kmmbalances.data.remote

import com.example.kmmbalances.Config
import com.example.kmmbalances.createHttpClient
import com.example.kmmbalances.data.model.BusquedaData
import com.example.kmmbalances.data.model.BusquedadResponse
import com.example.kmmbalances.domain.model.Busqueda
import io.github.aakira.napier.Napier
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpRequestTimeoutException
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class BusquedaService:KtorApi() {
    suspend fun findForCorrelativoOrCuil(correlativo:String):Busqueda{
        val client = createHttpClient()

        try {
            val response = client.get {
                pathUrl(Config.ENDPOINT_FIND_CORRELATIVO_OR_CUIL)
                parameter("nroCorrelativo", correlativo)
            }.body<BusquedadResponse>()

            return response.result.toDomain()
        }
        catch (e:Exception){
            Napier.e("Request failed with exception", e)
            throw e
        }
        catch (e:HttpRequestTimeoutException){
            Napier.e("Request failed with HttpRequestTimeoutException", e)
            throw e
        }
        finally {
            client.close()
        }
    }

    private fun BusquedaData.toDomain():Busqueda{
        return Busqueda(id,razonSocial,nroCorrelativo,cuit, tipoEntidad, estado)
    }
}