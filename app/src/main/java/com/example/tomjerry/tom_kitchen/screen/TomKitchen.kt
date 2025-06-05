package com.example.tomjerry.tom_kitchen.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.tom_kitchen.composable.AddToCartBar
import com.example.tomjerry.tom_kitchen.composable.FoodDetails
import com.example.tomjerry.tom_kitchen.composable.Header
import com.example.tomjerry.tom_kitchen.composable.MealPastaImage

@Composable
fun TomKitchen() {
    Scaffold(
        bottomBar = { AddToCartBar() }, containerColor = Color.Transparent
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Header()
            FoodDetails()
            MealPastaImage(
                modifier = Modifier
                    .padding(top = 18.dp, end = 24.19.dp)
                    .align(Alignment.TopEnd)
            )
        }
    }
}


@Preview(showBackground = true, widthDp = 360, heightDp = 772)
@Composable
fun TomKitchenPreview() {
    TomKitchen()
}