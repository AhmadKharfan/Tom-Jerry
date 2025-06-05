package com.example.tomjerry.tom_kitchen.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.tom_kitchen.data.PreparationStep
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.PrimaryTextColor

@Composable
fun PreparationSection(
    title: String,
    steps: List<PreparationStep>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(vertical = 24.dp)
    ) {
        Text(
            text = title,
            fontFamily = Ibm,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            letterSpacing = 0.5.sp,
            color = PrimaryTextColor.copy(alpha = 0.87f)
        )

        Spacer(Modifier.height(2.dp))

        Column {
            steps.forEachIndexed { index, step ->
                PreparationStepItem(step = step)
                if (index != steps.lastIndex) {
                    Spacer(Modifier.height(8.dp))
                }
            }
        }
    }

}
