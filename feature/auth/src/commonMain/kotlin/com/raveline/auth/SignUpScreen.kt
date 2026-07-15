package com.raveline.auth

import ContentWithMessageBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.raveline.auth.components.SignUpScreenComponent
import rememberMessageBarState

@Composable
fun SignUpScreen(
    onLoginClick: () -> Unit,
    onSuccess: () -> Unit,
    onFacebookClick: () -> Unit = {},
    onGoogleClick: () -> Unit = {},
    viewModel: AuthViewModel = viewModel { AuthViewModel() }
) {
    val state by viewModel.state.collectAsState()
    val messageBarState = rememberMessageBarState()

    LaunchedEffect(state.error) {
        state.error?.let {
            messageBarState.addError(Exception(it))
            viewModel.clearError()
        }
    }

    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) {
            onSuccess()
        }
    }

    Scaffold { paddingValues ->
        ContentWithMessageBar(
            modifier = Modifier.padding(paddingValues),
            messageBarState = messageBarState,
            errorMaxLines = 2,
            content = {
                Column(modifier = Modifier.fillMaxSize()) {
                    SignUpScreenComponent(
                        isLoading = state.isLoading,
                        onSignUpClick = { email, password ->
                            viewModel.signUp(email, password)
                        },
                        onLoginClick = onLoginClick,
                        onFacebookClick = onFacebookClick,
                        onGoogleClick = onGoogleClick
                    )
                }
            }
        )
    }
}
