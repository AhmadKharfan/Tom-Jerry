package com.example.tomjerry.tom_account.data

import androidx.annotation.DrawableRes
import com.example.tomjerry.R

data class ListAccountItem(
    val title: String, @DrawableRes val icon: Int
)

val settings = listOf(
    ListAccountItem(
        "Change sleeping place",
        R.drawable.ic_bed
    ),
    ListAccountItem(
        "Meow settings",
        R.drawable.ic_kitten
    ),
    ListAccountItem(
        "Password to open the fridge",
        R.drawable.ic_fridge
    )
)

val favoriteFoods = listOf(
    ListAccountItem(
        title = "Mouses",
        icon = R.drawable.ic_warning
    ),
    ListAccountItem(
        title = "Last stolen meal",
        icon = R.drawable.ic_meal
    ),
    ListAccountItem(
        title = "Change sleep mood",
        icon = R.drawable.ic_sleep
    )
)