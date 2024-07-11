package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class BalanceData(
    val id: String,
    val caratula: CaratulaData,
    val archivos: List<ArchivoData>,
    val autoridades: List<AutoridadData>,
    val estadoContable: EstadoContableData,
    val libros: List<LibroData>,
    val contador: ContadorData,
    val socios: List<SocioData>,
    val presentacion: PresentacionData,
    val hash: String
)