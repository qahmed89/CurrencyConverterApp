package com.example.currencyconverterapp.main

import com.example.currencyconverterapp.data.model.CurrencyResponse
import com.example.currencyconverterapp.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}