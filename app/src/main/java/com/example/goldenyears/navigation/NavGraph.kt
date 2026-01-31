package com.example.goldenyears.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.goldenyears.screens.HomeScreen
import com.example.goldenyears.screens.LoginScreen
import com.example.goldenyears.screens.SelectFontSizeScreen
import com.example.goldenyears.screens.SignupScreen


@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: Screens = Screens.SelectFontSize
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Screens.SelectFontSize> {
            SelectFontSizeScreen(
                onNavigateToSignup = {
                    navController.navigate(route = Screens.Signup)
                }
            )
        }

        composable<Screens.Signup> {
            SignupScreen(
                onNavigateToHome = {
                    navController.navigate(route = Screens.Home)
                },
                onNavigateToLogin = {
                    navController.navigate(route = Screens.Login)
                }
            )
        }

        composable<Screens.Login> {
            LoginScreen(
                onNavigateToHome = {
                    navController.navigate(route = Screens.Home)
                }
            )
        }

        composable<Screens.Home> {
            HomeScreen()
        }
    }
}


/*      This is from when HomeScreen took email/password from login,
        leaving it to show how to do it if needed
composable<Screens.Login> {
    LoginScreen(
        onNavigateToHome = { email, password -> navController.navigate(route = Screens.Home(email, password)) },
    )
}
*/


/*      This is from when HomeScreen took email/password from login,
        leaving it to show how to do it if needed

composable<Screens.Home> {
    val args = it.toRoute<Screens.Home>() // Doing this to extract arguments thats passed to this route
    HomeScreen(
        email = args.email,
        password =args.password
    )
}
*/