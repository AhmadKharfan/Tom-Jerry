package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.BrandBluePrimary
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor

@Composable
fun CheapTomHeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "Cheap tom section",
                color = PrimaryTextColor,
                fontFamily = Ibm,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = Modifier
                .padding(vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "View all",
                color = BrandBluePrimary,
                fontFamily = Ibm,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Right
            )
            Icon(
                painter = painterResource(R.drawable.ic_arrow_right),
                tint = BrandBluePrimary,
                contentDescription = "view all",
                modifier = Modifier.size(12.dp)
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun CheapTomHeaderSectionPreview() {
    CheapTomHeaderSection()
}