package com.delivery.api.domain.usecases.product

import com.delivery.api.domain.models.product.Product

interface ListProducts {
    fun findAll(): List<Product>
}