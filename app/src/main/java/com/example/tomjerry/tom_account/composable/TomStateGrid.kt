package com.example.tomjerry.tom_account.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.tom_account.data.StatCardData
import com.example.tomjerry.tom_account.data.stats

@Composable
fun StatCardsGrid(
    cards: List<StatCardData>, modifier: Modifier = Modifier
) {
    Column(modifier) {
        cards.chunked(2)
            .forEach { row ->
                Row(
                    Modifier
                        .padding(vertical = 4.dp)
                ) {
                    row.forEachIndexed { idx, card ->
                        StatTomCard(card, Modifier.weight(1f))
                        if (idx == 0) Spacer(Modifier.width(8.dp))
                    }
                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun StatsOnlyScreen() {
    StatCardsGrid(cards = stats)
}