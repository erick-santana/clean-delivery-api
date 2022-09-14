package com.delivery.api.domain.models.restaurant

import com.delivery.api.domain.models.common.Period

data class Restaurant(
    val name: String,
    val address: Address,
    val photo: String,
    val openingHours: Period
    )

data class Address(
    val street: String,
    val number: String,
    val district: String,
    val city: String,
    val state: String,
    val country: String
    )


