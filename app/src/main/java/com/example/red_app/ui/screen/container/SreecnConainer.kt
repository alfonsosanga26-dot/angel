package com.example.red_app.ui.screen.container

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.red_app.ui.Page.Main.MainScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.red_app.ui.screen.login.LoginScreen
import com.example.red_app.ui.screen.register.RegisterScreen
import com.example.red_app.ui.screen.welcome.WelcomeScreen



@Composable
@Preview
fun ScreenContainer() {
    val navHost = rememberNavController()

    NavHost(
        navController = navHost,
        startDestination = NavGraph.Welcome.route
    ) {
        composable(NavGraph.Welcome.route) {
            WelcomeScreen(
                onOpenLoginCliked ={
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }

        composable(NavGraph.Login.route) {
            LoginScreen(
                onOpenMainClicked = {
                    navHost.navigate(NavGraph.MainScreen.route)
                },
                onOpenRegisterClicked = {
                    navHost.navigate(NavGraph.Register.route)
                }
            )
        }

        composable(NavGraph.Register.route) {
            RegisterScreen(
                onOpenMainClicked = {
                    navHost.navigate(NavGraph.MainScreen.route)
                },
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }

        composable(NavGraph.MainScreen.route) {
            MainScreen()
        }
    }
}
