import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.WindowInsets
import com.example.tomjerry.jerry_store.composable.CheapTomHeaderSection
import com.example.tomjerry.jerry_store.composable.CustomSearchBar
import com.example.tomjerry.jerry_store.composable.Header
import com.example.tomjerry.jerry_store.composable.TomOfferCard
import com.example.tomjerry.jerry_store.composable.TomProductsGrid
import com.example.tomjerry.jerry_store.data.dummyTomItems
import com.example.tomjerry.ui.theme.SurfaceBackground

@Composable
fun JerryStore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SurfaceBackground)
            .padding(WindowInsets.systemBars.asPaddingValues())
            .padding(horizontal = 16.dp)
    ) {
        Header()
        CustomSearchBar()
        TomOfferCard()
        CheapTomHeaderSection()
        TomProductsGrid(dummyTomItems)
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun JerryStorePreview() {
    JerryStore()
}
