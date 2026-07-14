package com.raveline.mystore

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.raveline.navigation.graph.SetupNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
        SetupNavGraph()
    }
}