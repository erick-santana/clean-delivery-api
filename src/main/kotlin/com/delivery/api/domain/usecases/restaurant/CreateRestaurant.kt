package com.delivery.api.domain.usecases.restaurant

import com.delivery.api.domain.models.restaurant.Restaurant

interface CreateRestaurant {
    fun create(restaurant: Restaurant): Restaurant
}