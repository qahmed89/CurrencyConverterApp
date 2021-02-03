package com.example.currencyconverterapp.main

import com.example.currencyconverterapp.data.CurrencyApi
import com.example.currencyconverterapp.data.model.CurrencyResponse
import com.example.currencyconverterapp.util.Resource
import javax.inject.Inject

class DefualtMainRepository @Inject constructor(private val api: CurrencyApi) : MainRepository {


    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val responce = api.getRates(base)
            val result = responce.body()

            if (responce.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(responce.message())
            }

        } catch (e: Exception) {

            Resource.Error(e.message ?: "An Error occured")
        }


    }

}