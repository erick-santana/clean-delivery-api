package com.delivery.api.domain.product

import com.delivery.api.domain.common.Period
import java.math.BigDecimal

data class Product(
    val id: String,
    val name: String,
    val photo: String,
    val price: BigDecimal,
    val category: Category,
    val promotion: Promotion
    )

data class Promotion(
    val active: Boolean,
    val description: String,
    val price: BigDecimal,
    val period: Period
    )

enum class Category {
    CANDY, SAVORY, JUICES
}


