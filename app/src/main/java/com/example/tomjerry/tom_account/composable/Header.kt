package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.SurfaceDivider

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(242.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_profile),
            contentDescription = "Meal Background",
            modifier = Modifier
                .fillMaxWidth()
                .height(242.dp),
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.tom_profile),
                contentDescription = "Tom Profile",
                modifier = Modifier
                    .padding(bottom = 4.dp)
                    .size(64.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier.height(45.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Tom",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    color = White,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "specializes in failure!",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Normal,
                    color = SurfaceDivider,
                    fontSize = 12.sp,
                    lineHeight = 8.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 4.dp, bottom = 8.dp)
                    .height(25.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(color = White.copy(alpha = 0.12f))
                    .padding(horizontal = 12.dp, vertical = 5.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "Edit foolishness",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    lineHeight = 8.sp,
                    maxLines = 1,
                    color = White,
                )
            }
        }
    }

}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun HeaderPreview() {
    Header()
}