package com.uzb7.exchangerates.model

data class Courses(
    val base: String,
    val date: String,
    val rates: Rates,
    val success: Boolean,
    val timestamp: Int
)