package com.example.smartfinance.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.example.smartfinance.presentation.components.DynamicList
import com.example.smartfinance.ui.theme.Typography


@Composable
fun HomeScreen () {
    Column {
        Box(modifier = Modifier
            .height(400.dp)
            .padding(16.dp)
        ) {
            Text("Home Screen", style = Typography.headlineLarge)
        }

        DynamicList()
    }
}