package com.raveline.navigation.graph

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens {
    @Serializable
    data object Login : Screens()
    @Serializable
    data object SignUp : Screens()
    @Serializable
    data object ForgotPassword : Screens()
    @Serializable
    data object Home : Screens()
    @Serializable
    data object Profile : Screens()
}