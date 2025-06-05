package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.tom_account.data.ListAccountItem
import com.example.tomjerry.tom_account.data.settings

@Composable
fun SettingsSection(
    items: List<ListAccountItem>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        items.forEachIndexed { index, item ->
            SettingRow(item)
            if (index != items.lastIndex) Spacer(Modifier.height(12.dp))
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun SettingsSectionPreview() {
    SettingsSection(
        settings
    )
}