package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.BrandBluePrimaryVariant
import com.example.tomjerry.ui.theme.BrandBlueSecondary
import com.example.tomjerry.ui.theme.Ibm


@Composable
fun TomOfferCard(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .padding(top = 8.dp, bottom = 24.dp)
            .height(108.dp)
            .fillMaxWidth(),
    ) {

        Image(
            painter = painterResource(R.drawable.bg_banner),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(16.dp))
                .height(92.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(BrandBluePrimaryVariant, BrandBlueSecondary),
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                    )
                ),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(id = R.drawable.tom_banner),
            contentDescription = "Tom",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(108.dp)
                .clip(RoundedCornerShape(bottomEnd = 16.dp))
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(92.dp)
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = "Buy 1 Tom and get 2 for free",
                fontFamily = Ibm,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.White
            )

            Row {
                Text(
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    color = Color.White.copy(alpha = 0.8f),
                    modifier = Modifier.weight(1f),
                )
                Box(modifier = Modifier.weight(1f))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TomOfferCardPreview() {
    TomOfferCard()
}