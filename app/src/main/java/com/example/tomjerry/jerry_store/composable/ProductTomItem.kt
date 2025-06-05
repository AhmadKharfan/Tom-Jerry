package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tomjerry.R
import com.example.tomjerry.jerry_store.data.TomItem
import com.example.tomjerry.jerry_store.data.dummyTomItems
import com.example.tomjerry.ui.theme.SurfaceButton
import com.example.tomjerry.ui.theme.BrandBluePrimary
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor
import com.example.tomjerry.ui.theme.TextSearchBar

@Composable
fun ProductTomItem(
    item: TomItem,
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .height(235.dp)
            .fillMaxWidth(),
    ) {

        Image(
            painter = painterResource(item.imageRes),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .height(100.dp)
                .zIndex(1f)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .height(219.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .align(Alignment.BottomStart)
                .padding(horizontal = 8.dp)
                .padding(top = 92.dp, bottom = 8.dp),
        ) {
            Text(
                text = item.title,
                fontFamily = Ibm,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                color = PrimaryTextColor,
                textAlign = TextAlign.Center,
                maxLines = 1,
                modifier = Modifier.fillMaxWidth(),
            )

            Text(
                text = item.description,
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = TextSearchBar,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
            )

            Row(Modifier.height(30.dp)) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .height(30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(SurfaceButton)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_money_bag),
                        contentDescription = "money",
                        colorFilter = ColorFilter.tint(BrandBluePrimary),
                        modifier = Modifier.height(16.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    if(item.price == 3) {
                        Text(
                            text = "5",
                            color = BrandBluePrimary,
                            fontFamily = Ibm,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            style = TextStyle(
                                textDecoration = TextDecoration.LineThrough,
                                color = BrandBluePrimary
                            ),
                            modifier = Modifier.padding(end = 3.dp)
                        )
                    }
                    Text(
                        text = "${item.price} cheeses",
                        fontFamily = Ibm,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        color = BrandBluePrimary,
                    )
                }

                Spacer(Modifier.width(8.dp))

                Button(
                    onClick = { },
                    modifier = Modifier.size(30.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, BrandBluePrimary),
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_add_to_cart),
                        contentDescription = "add to cart",
                        colorFilter = ColorFilter.tint(BrandBluePrimary),
                        modifier = Modifier.size(16.dp),
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true, widthDp = 360, heightDp = 772)
@Composable
fun ProductTomItemPreview() {
    ProductTomItem(dummyTomItems.first(), Modifier)
}