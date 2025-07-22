package com.personal.shopping.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
data object ProductsListing

@Composable
fun ProductsListingScreen(navController1: NavHostController) {
    Text("products Listing")
}

@Composable
fun AppNavHost() {

    val navController = rememberNavController()
    NavHost(navController, startDestination = ProductsListing) {
        composable<ProductsListing> {
            ProductsListingScreen(navController)
        }
    }
}