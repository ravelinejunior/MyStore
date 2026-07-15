package com.raveline.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.raveline.auth.AuthenticationScreen
import com.raveline.auth.SignUpScreen
import openWebBrowser

@Composable
fun SetupNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Login
    ) {
        composable<Screens.Login> {
            AuthenticationScreen(
                onCreateAccountClick = {
                    navController.navigate(Screens.SignUp)
                },
                onFacebookClick = {
                    navController.navigate(Screens.SignUp)
                },
                onSuccess = {
                    // Navigate to home or dashboard
                }
            )
        }
        composable<Screens.SignUp> {
            SignUpScreen(
                onLoginClick = {
                    navController.popBackStack()
                },
                onFacebookClick = {
                    openWebBrowser("https://www.facebook.com")
                },
                onSuccess = {
                    // Navigate to home or dashboard
                }
            )
        }
    }
}