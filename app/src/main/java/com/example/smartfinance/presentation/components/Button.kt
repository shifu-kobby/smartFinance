package com.example.smartfinance.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonWithText(
    buttonText: String,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColor: Color = MaterialTheme.colorScheme.primary, // Default color
    contentColor: Color = Color.White, // Default text/icon color,
    cornerSize: Dp = 8.dp
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(cornerSize),
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor, // Background color
            contentColor = contentColor  // Text & icon color
        )
    ) {
        Text(
            text = buttonText
        )
        Spacer(modifier = Modifier
            .width(8.dp)) // Space between icon and text
        icon()
    }
}
