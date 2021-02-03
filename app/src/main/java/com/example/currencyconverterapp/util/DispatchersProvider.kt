package com.example.currencyconverterapp.util

import kotlinx.coroutines.CoroutineDispatcher

interface DispatchersProvider {

    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val defualt : CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}