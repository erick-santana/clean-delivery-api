package com.delivery.api.domain.usecases.product

import com.delivery.api.domain.models.product.Product

interface CreateProduct {
    fun create(product: Product): Product
}