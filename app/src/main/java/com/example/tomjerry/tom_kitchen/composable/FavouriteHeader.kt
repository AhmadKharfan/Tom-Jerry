package com.example.tomjerry.tom_kitchen.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.ui.theme.BrandBluePrimary
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor
import com.example.tomjerry.ui.theme.SurfaceCardSmall

@Composable
fun FavouriteHeader(
    title: String,
    badgeText: String,
    @DrawableRes badgeIcon: Int,
    @DrawableRes favIcon: Int,
    onBadgeClick: () -> Unit,
    onFavouriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = title,
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                letterSpacing = 0.5.sp,
                color = PrimaryTextColor.copy(alpha = 0.87f)
            )

            Button(
                onClick = onBadgeClick,
                modifier = Modifier.height(30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = SurfaceCardSmall),
                contentPadding = PaddingValues(vertical = 7.dp, horizontal = 10.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    painter = painterResource(badgeIcon),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(BrandBluePrimary),
                    modifier = Modifier.height(16.dp)
                )
                Spacer(Modifier.width(4.dp))
                Text(
                    text = badgeText,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    color = BrandBluePrimary
                )
            }
        }

        Button(
            onClick = onFavouriteClick,
            modifier = Modifier.size(24.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(0.dp)
        ) {
            Image(
                painter = painterResource(favIcon),
                contentDescription = null,
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(BrandBluePrimary.copy(alpha = 0.87f))
            )
        }
    }
}
