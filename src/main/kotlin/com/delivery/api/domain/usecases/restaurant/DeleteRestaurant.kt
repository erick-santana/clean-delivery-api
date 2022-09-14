package com.delivery.api.domain.usecases.restaurant

interface DeleteRestaurant {
    fun delete(id: Long): Void
}