package com.example.smartfinance.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartfinance.presentation.viewmodel.ListViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.smartfinance.ui.theme.Typography

@Composable
fun DynamicList(viewModel: ListViewModel = viewModel()) {
    val items by viewModel.items.collectAsState()

    Text(
        "Operations",
        style = Typography.headlineMedium
    )
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items) { item ->
            ListItem(name = item)
        }
    }
}

@Composable
fun ListItem(name: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(
            text = name,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}