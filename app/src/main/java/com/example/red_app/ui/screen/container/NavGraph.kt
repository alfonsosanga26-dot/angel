package com.example.red_app.ui.screen.container

sealed class NavGraph(val route: String) {

    data object Welcome: NavGraph(route = "welcome_screen")
    data object Login: NavGraph(route = "login_screen")
    data object Register: NavGraph(route = "register_screen")
    data object MainScreen: NavGraph(route = "main_screen")
}