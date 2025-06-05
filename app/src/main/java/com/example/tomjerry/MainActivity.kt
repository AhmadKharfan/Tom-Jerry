package com.example.tomjerry

import JerryStore
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tomjerry.tom_account.screen.TomAccount
import com.example.tomjerry.tom_kitchen.screen.TomKitchen
import com.example.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryTheme {
                TomAccount()
            }
        }
    }
}
