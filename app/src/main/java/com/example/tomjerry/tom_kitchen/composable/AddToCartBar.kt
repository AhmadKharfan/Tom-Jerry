package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.SurfaceButtonPressed
import com.example.tomjerry.ui.theme.Ibm


@Composable
fun AddToCartBar(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(86.dp)
            .background(color = White),
    ) {
        Box(
            modifier = Modifier.padding(vertical = 15.dp, horizontal = 16.dp),
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(containerColor = SurfaceButtonPressed),
                onClick = { },
                shape = RoundedCornerShape(16.dp),
            ) {
                Text(
                    text = "Add to cart",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = White.copy(alpha = 0.87f),
                )
                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .size(5.dp)
                        .clip(CircleShape)
                        .background(color = White.copy(alpha = 0.38f))
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "3 cheeses",
                        fontFamily = Ibm,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        letterSpacing = 0.5.sp,
                        color = White,
                    )
                    Text(
                        text = "5 cheeses",
                        fontFamily = Ibm,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp,
                        textDecoration = TextDecoration.LineThrough,
                        color = White.copy(alpha = 0.8f),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 772)
@Composable
fun AddToCartBarPreview() {
    AddToCartBar()
}