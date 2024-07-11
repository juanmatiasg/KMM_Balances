package com.example.kmmbalances.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EstadoContableData(
    val tipoBalance:String,
    val fechaEstado:String,
    val fechaInicio:String,
    val fechaReunionDirectorio:String,
    val cajaYBancos:Double,
    val inversionesActivoCorriente:Double,
    val bienesDeCambio:Double,
    val activoCorrienteRestante:Double,
    val activoCorriente:Double,
    val bienesDeUso:Double,
    val propiedadesDeInversion:Double,
    val inversionesActivoNoCorriente:Double,
    val activoNoCorrienteRestante:Double,
    val activoNoCorriente:Double,
    val totalActivo:Double,
    val deudorPasivoCorriente:Double,
    val pasivoCorriente:Double,
    val deudoPasivoNoCorriente:Double,
    val totalPasivo:Double,
    val patrimonioNeto:Double,
    val capitalSuscrito:Double,
    val ajusteCapital:Double,
    val aportesIrrevocables:Double,
    val primaEmision:Double,
    val resultadosEjercicios:Double,
    val gananciasPerdidasInicioEjercicio:Double,
    val reservalLegal:Double,
    val totalRubro:Double,
    val otrosRubros:ArrayList<RubroPatrimonioNetoData>
)


