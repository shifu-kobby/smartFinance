package com.example.smartfinance.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Insights
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartfinance.domain.model.BottomNavItem
import com.example.smartfinance.presentation.screens.HomeScreen
import com.example.smartfinance.presentation.screens.InsightsScreen
import com.example.smartfinance.presentation.screens.ProfileScreen
import com.example.smartfinance.presentation.screens.WalletScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    val bottomNavItems = listOf(
        BottomNavItem("Home", "home", Icons.Default.Home),
        BottomNavItem("Insights", "insights", Icons.Default.Insights),
        BottomNavItem("Wallet", "wallet", Icons.Default.Wallet),
        BottomNavItem("Profile", "profile", Icons.Default.AccountCircle)
    )

    Scaffold(
        bottomBar = {
            BottomBar(navController, bottomNavItems)
        }
    ) { paddingValues ->
        NavHost(
            navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)) {
                composable("home") {
                    HomeScreen()
                }
                composable("insights") {
                    InsightsScreen()
                }
                composable("wallet") {
                    WalletScreen()
                }
                composable("profile") {
                    ProfileScreen()
                }
            }
    }
}