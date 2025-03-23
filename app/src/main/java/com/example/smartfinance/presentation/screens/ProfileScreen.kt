package com.example.smartfinance.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.example.smartfinance.ui.theme.Typography


@Composable
fun ProfileScreen () {
    Box(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Profile Screen", style = Typography.headlineLarge)
    }
}