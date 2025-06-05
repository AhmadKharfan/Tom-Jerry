package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomjerry.jerry_store.data.TomItem
import com.example.tomjerry.jerry_store.data.dummyTomItems

@Composable
fun TomProductsGrid(
    items: List<TomItem>
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 160.dp),
        contentPadding = PaddingValues(bottom = 16.dp, top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(items.size) { index ->
            val tom = items[index]
            ProductTomItem(item = tom, modifier = Modifier.fillMaxWidth())
        }
    }
}


@Preview(showBackground = true, widthDp = 360, heightDp = 772)
@Composable
fun TomProductsGridPreview() {
    TomProductsGrid(dummyTomItems)
}