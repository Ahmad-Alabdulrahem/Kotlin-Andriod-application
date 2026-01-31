package com.example.goldenyears.navigation

import kotlinx.serialization.Serializable



@Serializable
sealed class Screens {
    @Serializable
    data object  Home: Screens()

    @Serializable
    data object Profile: Screens()

    @Serializable
    data object Login: Screens()

    @Serializable
    data object SelectFontSize: Screens()

    @Serializable
    data object Signup: Screens()
}

// This is from when HomeScreen took email/password from login, leaving it to show how to do it if needed
//@Serializable
//    data class Home(
//        val email: String,
//        val password: String
//    ): Screens()
