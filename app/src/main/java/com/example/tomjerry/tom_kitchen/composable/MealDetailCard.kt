package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_kitchen.data.MealDetail
import com.example.tomjerry.ui.theme.TextDisabled
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.IconDefault
import com.example.tomjerry.ui.theme.TextHint
import com.example.tomjerry.ui.theme.SurfaceCardSmall

@Composable
fun MealDetailCard(
    detail: MealDetail, modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(SurfaceCardSmall)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(detail.iconRes),
                contentDescription = detail.label,
                modifier = Modifier.size(32.dp),
                colorFilter = ColorFilter.tint(IconDefault)
            )

            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = detail.value,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    letterSpacing = 0.5.sp,
                    color = TextDisabled
                )
                Text(
                    text = detail.label,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp,
                    color = TextHint
                )
            }
        }
    }
}
