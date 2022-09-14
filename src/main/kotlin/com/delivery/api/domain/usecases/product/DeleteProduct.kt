package com.delivery.api.domain.usecases.product

interface DeleteProduct {
    fun delete(id: Long): Void
}