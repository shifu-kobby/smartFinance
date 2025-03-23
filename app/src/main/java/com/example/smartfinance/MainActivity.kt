package com.example.smartfinance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.smartfinance.presentation.components.AppNavGraph
import com.example.smartfinance.presentation.viewmodel.UserViewModel
import com.example.smartfinance.ui.theme.SmartFinanceTheme
import com.example.smartfinance.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartFinanceTheme {
                AppNavGraph()
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val userViewModel: UserViewModel = viewModel()
    val user by userViewModel.user.collectAsState()
    Text(
        text = "Hello ${user.name}!",
        modifier = modifier,
        style = Typography.bodySmall
    )
}