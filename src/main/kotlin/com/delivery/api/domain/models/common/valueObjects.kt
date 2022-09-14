package com.delivery.api.domain.models.common

data class Period(
    val days: List<Day>
    )

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}