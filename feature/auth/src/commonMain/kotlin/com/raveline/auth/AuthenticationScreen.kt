package com.raveline.auth

import ContentWithMessageBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raveline.auth.components.AuthenticationScreenComponent
import rememberMessageBarState

@Composable
fun AuthenticationScreen() {
    val messageBarState = rememberMessageBarState()

    Scaffold { paddingValues ->
        ContentWithMessageBar(
            modifier = Modifier.padding(paddingValues),
            messageBarState = messageBarState,
            errorMaxLines = 2,
            content = {
                Column(modifier = Modifier.fillMaxSize())
                {
                    AuthenticationScreenComponent()
                }
            }
        )
    }
}
