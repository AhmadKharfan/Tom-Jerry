package com.example.tomjerry.tom_account.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomjerry.tom_account.composable.AccountDetails
import com.example.tomjerry.tom_account.composable.Header

@Composable
fun TomAccount() {

    Scaffold(
        containerColor = Color.Transparent
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Header()
            AccountDetails()
        }
    }

}

@Preview(showBackground = true, widthDp = 360, heightDp = 827)
@Composable
fun TomAccountPreview() {
    TomAccount()
}