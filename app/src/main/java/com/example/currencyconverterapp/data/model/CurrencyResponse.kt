package com.example.currencyconverterapp.data.model

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)