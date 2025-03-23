package com.example.smartfinance.presentation.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.smartfinance.domain.model.BottomNavItem

@Composable
fun BottomBar(navController: NavController, items: List<BottomNavItem>) {
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = navController.currentDestination?.route == item.route,
                onClick = { navController.navigate(item.route) }
            )
        }
    }
}