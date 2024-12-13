package com.example.professionali_pr22_102_boboev

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.mainscreen.route
    ) {
        composable(route = Screen.mainscreen.route) {
            mainscreen(navController = navController)
        }
        composable(route = Screen.mainscreen.route) {
            mainscreen(navController = navController)
        }
    }
}