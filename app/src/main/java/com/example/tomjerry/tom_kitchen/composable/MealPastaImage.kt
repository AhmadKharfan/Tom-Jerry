package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.tomjerry.R

@Composable
fun MealPastaImage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .zIndex(1f)
    ) {
        Image(
            painter = painterResource(R.drawable.pasta),
            contentDescription = "past meal",
            modifier = Modifier.size(188.dp, 168.dp)
        )
    }
}


@Preview
@Composable
fun MealPastImagePreview() {
    MealPastaImage()
}