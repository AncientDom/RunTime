package com.runtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val date2026 = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, 2026"))
            MaterialTheme {
                Scaffold(topBar = { CenterAlignedTopAppBar(title = { Text("RunTime $date2026") }) }) { padding ->
                    Text("Offline Planner Ready", modifier = androidx.compose.ui.Modifier.padding(padding))
                }
            }
        }
    }
}
