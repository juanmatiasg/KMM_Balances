package com.example.kmmbalances.data.model

import com.example.kmmbalances.domain.model.Balance

data class BalanceResponse (
    val result: BalanceData,
    val isSuccess:Boolean,
    val message:String
)