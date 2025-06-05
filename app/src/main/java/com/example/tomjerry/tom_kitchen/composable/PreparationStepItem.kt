package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_kitchen.data.PreparationStep
import com.example.tomjerry.tom_kitchen.data.preparationSteps
import com.example.tomjerry.ui.theme.TextDisabled
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.IconDefault
import com.example.tomjerry.ui.theme.SurfaceCardSmall

@Composable
fun PreparationStepItem(
    step: PreparationStep, modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 2.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .height(37.dp)
                .align(Alignment.Center)
                .clip(RoundedCornerShape(12.dp))
                .background(White)
        ) {
            Text(
                text = step.text,
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                letterSpacing = 0.5.sp,
                overflow = TextOverflow.Ellipsis,
                color = TextDisabled,
                modifier = Modifier
                    .padding(start = 25.dp)
                    .align(Alignment.CenterVertically)
                    .weight(1f)
            )

        }

        Box(
            modifier = Modifier
                .size(37.dp)
                .border(
                    width = 1.dp, color = SurfaceCardSmall, shape = CircleShape
                )
                .clip(CircleShape)
                .background(White)
        ) {
            Text(
                text = step.number.toString(),
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = IconDefault,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun PreparationStepItemPreview() {
    PreparationStepItem(preparationSteps.first())
}
