package com.example.tomjerry.tom_account.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.tomjerry.R

data class StatCardData(
    val value: String,
    val label: String,
    val bgColor: Color,
    @DrawableRes val icon: Int
)

val stats = listOf(
    StatCardData("2M 12K", "No. of quarrels",
        bgColor = Color(0xFFD0E5F0), icon = R.drawable.devil_state),

    StatCardData("+500 h", "Chase time",
        bgColor = Color(0xFFDEEECD), icon = R.drawable.run_state),

    StatCardData("2M 12K", "Hunting times",
        bgColor = Color(0xFFF2D9E7), icon = R.drawable.sad_state),

    StatCardData("3M 7K", "Heartbroken",
        bgColor = Color(0xFFFAEDCF), icon = R.drawable.broken_state)
)