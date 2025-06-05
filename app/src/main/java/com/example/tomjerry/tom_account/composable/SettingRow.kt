package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_account.data.ListAccountItem
import com.example.tomjerry.tom_account.data.settings
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor

@Composable
fun SettingRow(
    item: ListAccountItem, modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = modifier
    ) {
        Box(
            Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(White)
        ) {
            Image(
                painterResource(item.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(Modifier.width(8.dp))

        Text(
            item.title,
            fontFamily = Ibm,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = PrimaryTextColor.copy(alpha = 0.87f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SettingRowPreview() {
    SettingRow(item = settings.first())
}