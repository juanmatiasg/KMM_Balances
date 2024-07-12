package com.example.kmmbalances.domain.model

import kotlinx.serialization.Serializable

@Serializable
enum class TipoLibro {
    MEMORIA,
    ADMINISTRACION,
    ASAMBLEA,
    ASISTENCIA_ASAMBLEA,
    SITUACION_PATRIMONIAL,
    RESULTADOS,
    PATRIMONIO_NETO,
    EFECTIVO,
    INFORMACION,
    ESTADOS_CONTABLES_CONSOLIDADOS,
    FISCALIZACION,
    AUDITOR,
    IVA,
    IVA_COMPRAS,
    IVA_VENTAS
}