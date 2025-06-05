package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.BrandBluePrimary
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.SurfaceBorderNotification
import com.example.tomjerry.ui.theme.PrimaryTextColor
import com.example.tomjerry.ui.theme.TextSecondary

@Composable
fun Header() {
    Row(Modifier.fillMaxWidth()) {
        AppBarInfo(Modifier.weight(1f))
        NotificationIcon(Modifier.padding(vertical = 8.dp))
    }
}

@Composable
fun NotificationIcon(
    modifier: Modifier = Modifier, counter: Int = 3
) {
    BadgedBox(
        badge = {
            Badge(
                modifier = Modifier
                    .size(14.dp)
                    .offset(y = (-4).dp),
                containerColor = BrandBluePrimary,
                contentColor = Color.White
            ) {
                Text(counter.toString(), fontSize = 10.sp)
            }
        }, modifier = modifier
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_notification),
            contentDescription = "notification",
            modifier = Modifier
                .size(40.dp)
                .border(
                    1.dp, SurfaceBorderNotification, RoundedCornerShape(12.dp)
                )
                .padding(8.dp)
        )
    }
}


@Composable
fun AppBarInfo(
    modifier: Modifier
) {
    Row(
        modifier = modifier.padding(vertical = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 4.dp)
                .size(48.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.jerry_profile),
                contentDescription = "Jerry Profile Image"
            )
        }

        Column(
            modifier = Modifier.padding(vertical = 4.5.dp, horizontal = 8.dp)
        ) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                color = PrimaryTextColor,
                fontFamily = Ibm,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Which Tom do you want to buy?",
                color = TextSecondary,
                fontFamily = Ibm,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        }


    }
}


@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}