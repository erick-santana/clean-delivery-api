package com.delivery.api.domain.common

data class Period(
    val days: List<Day>
    )

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}