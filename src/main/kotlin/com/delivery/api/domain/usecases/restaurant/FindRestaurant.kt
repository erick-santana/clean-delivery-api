package com.delivery.api.domain.usecases.restaurant

import com.delivery.api.domain.models.restaurant.Restaurant

interface FindRestaurant {
    fun findOne(id: Long): Restaurant
}