package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_account.data.StatCardData
import com.example.tomjerry.tom_account.data.stats
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.TextPrimary


@Composable
fun StatTomCard(
    data: StatCardData,
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .clip(RoundedCornerShape(12.dp))
            .background(data.bgColor)
            .height(58.dp)
            .padding(start = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painterResource(id = data.icon),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
        )

        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                data.value,
                fontFamily = Ibm,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                color = TextPrimary.copy(alpha = .60f)
            )
            Text(
                data.label,
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = TextPrimary.copy(alpha = .37f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatTomCardPreview() {
    StatTomCard(
        stats.first()
    )
}