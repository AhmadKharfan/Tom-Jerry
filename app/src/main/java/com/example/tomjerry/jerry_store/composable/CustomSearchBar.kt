package com.example.tomjerry.jerry_store.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.BrandBluePrimary
import com.example.tomjerry.ui.theme.Ibm
import com.example.tomjerry.ui.theme.TextSearchBar

@Composable
fun CustomSearchBar() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            value = "Search about tom ...",
            onValueChange = {},
            modifier = Modifier.weight(1f)
                .padding(end = 24.dp)
                .height(48.dp),
            shape = RoundedCornerShape(16.dp),
            textStyle = TextStyle(
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                color = TextSearchBar,
                fontSize = 14.sp
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = "search icon",
                    modifier = Modifier.size(24.dp)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
            )
        )

        IconButton(
            onClick = {},
            modifier = Modifier.size(48.dp)
                .background(
                    color = BrandBluePrimary,
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_filter),
                tint = Color.White,
                contentDescription = "filter icon",
                modifier = Modifier.size(24.dp)
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun CustomSearchBarPreview() {
    CustomSearchBar()
}