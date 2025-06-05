package com.example.tomjerry.jerry_store.data

import androidx.annotation.DrawableRes
import com.example.tomjerry.R

data class TomItem(
    @DrawableRes val imageRes: Int,
    val title: String,
    val description: String,
    val price: Int
)

val dummyTomItems = listOf(
    TomItem(
        R.drawable.tom_item_1, "Sport Tom", "He runs 1 meter… trips over his boot.", 3
    ),

    TomItem(
        R.drawable.tom_item_2,
        "Tom the lover",
        "He loves one-sidedly… and is beaten by the other side.",
        5
    ),

    TomItem(
        R.drawable.tom_item_3, "Tom the bomb", "He blows himself up before Jerry can catch him.", 10
    ),

    TomItem(
        R.drawable.tom_item_4, "Spy Tom", "Disguises itself as a table.", 12
    ),

    TomItem(
        R.drawable.tom_item_5,
        "Frozen Tom",
        "He was chasing Jerry, he froze after the first look.",
        8
    ),

    TomItem(
        R.drawable.tom_item_6,
        "Sleeping Tom",
        "He doesn't chase anyone, he just snores in stereo.",
        7
    ),
)
