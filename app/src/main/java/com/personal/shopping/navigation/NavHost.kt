package com.personal.shopping.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.feature_product.ui.products.ProductListScreen
import kotlinx.serialization.Serializable

@Serializable
data object ProductsListing

@Serializable
data object ProductDetails


@Composable
fun AppNavHost() {

    val navController = rememberNavController()
    NavHost(navController, startDestination = ProductsListing) {

        composable<ProductsListing> {
            ProductListScreen(emptyList())
        }

        composable<ProductDetails> {
        }
    }
}