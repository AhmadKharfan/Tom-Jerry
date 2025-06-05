package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_account.data.favoriteFoods
import com.example.tomjerry.tom_account.data.settings
import com.example.tomjerry.tom_account.data.stats
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor
import com.example.tomjerry.ui.theme.SurfaceBackground
import com.example.tomjerry.ui.theme.TextPrimary

@Composable
fun AccountDetails(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 166.dp)
            .fillMaxSize()
            .clip(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .background(color = SurfaceBackground)
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 19.dp)
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            StatCardsGrid(
                stats
            )

            Column(
                modifier = Modifier.padding(top = 20.dp)
            ) {

                Text(
                    text = "Tom settings",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = PrimaryTextColor.copy(alpha = 0.87f),
                )

                Spacer(Modifier.height(8.dp))

                SettingsSection(
                    settings
                )

                Spacer(Modifier.height(12.dp))
                FullWidthDivider(
                    thickness = 1.dp
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    text = "His favorite foods",
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = PrimaryTextColor.copy(alpha = 0.87f),
                )

                Spacer(Modifier.height(8.dp))
                SettingsSection(
                    favoriteFoods
                )
            }
        }

        Box {
            Text(
                text = "v.TomBeta",
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = TextPrimary.copy(alpha = 0.6f),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp),
            )
        }

    }
}

@Composable
fun FullWidthDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    sidePadding: Dp = 16.dp
) {
    val density = LocalDensity.current
    Spacer(
        modifier
            .fillMaxWidth()
            .height(thickness)
            .drawBehind {
                val y = size.height / 2f
                val strokePx = with(density) { thickness.toPx() }
                val overhangPx = with(density) { sidePadding.toPx() }

                drawLine(
                    color = PrimaryTextColor.copy(alpha = 0.12f),
                    start = Offset(-overhangPx, y),
                    end = Offset(size.width + overhangPx, y),
                    strokeWidth = strokePx
                )
            }
    )
}


@Preview(showBackground = true, widthDp = 360, heightDp = 827)
@Composable
fun AccountDetailsPreview() {
    AccountDetails()
}