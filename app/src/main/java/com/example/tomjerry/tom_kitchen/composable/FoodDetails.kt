package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.tom_kitchen.data.detailsMeals
import com.example.tomjerry.tom_kitchen.data.preparationSteps
import com.example.tomjerry.ui.theme.SurfaceBackground
import com.example.tomjerry.ui.theme.TextDisabled
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor

@Composable
fun FoodDetails(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 162.dp)
            .fillMaxSize()
            .clip(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .background(color = SurfaceBackground)
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 32.dp)
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            FavouriteHeader(
                title = "Electric Tom pasta",
                badgeText = "5 cheeses",
                badgeIcon = R.drawable.ic_money_bag,
                favIcon = R.drawable.ic_favourite_filled,
                onBadgeClick = { },
                onFavouriteClick = { })

            Text(
                text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.5.sp,
                color = TextDisabled,
            )

            Column(
                modifier = Modifier.padding(top = 24.dp)
            ) {
                Text(
                    text = "Details",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    letterSpacing = 0.5.sp,
                    color = PrimaryTextColor.copy(alpha = 0.87f),
                )
                Spacer(Modifier.height(2.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    detailsMeals.forEach { item ->
                        MealDetailCard(
                            detail = item,
                            modifier = Modifier.weight(1f)
                                .height(109.dp)
                        )
                    }
                }
            }
            PreparationSection(
                title = "Preparation method",
                steps = preparationSteps
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 772)
@Composable
fun TomKitchenPreview() {
    FoodDetails()
}