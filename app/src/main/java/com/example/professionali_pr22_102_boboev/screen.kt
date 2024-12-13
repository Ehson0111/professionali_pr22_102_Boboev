package com.example.professionali_pr22_102_boboev


sealed class Screen(val route: String) {
    object mainscreen : Screen("mainsvreen")
    object splash : Screen("splash")
}