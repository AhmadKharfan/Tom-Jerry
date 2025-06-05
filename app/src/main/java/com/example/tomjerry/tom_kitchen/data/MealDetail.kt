package com.example.tomjerry.tom_kitchen.data

import androidx.annotation.DrawableRes
import com.example.tomjerry.R

data class MealDetail(
    @DrawableRes val iconRes: Int, val value: String, val label: String
)

val detailsMeals = listOf(
    MealDetail(R.drawable.ic_temperature, "1000 V", "Temperature"),
    MealDetail(R.drawable.ic_speed, "3 sparks", "Time"),
    MealDetail(R.drawable.ic_devil, "1M 12K", "No. of deaths")
)
