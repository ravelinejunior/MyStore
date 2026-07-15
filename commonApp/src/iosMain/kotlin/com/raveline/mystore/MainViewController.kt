package com.raveline.mystore

import androidx.compose.ui.window.ComposeUIViewController
import com.raveline.mystore.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }