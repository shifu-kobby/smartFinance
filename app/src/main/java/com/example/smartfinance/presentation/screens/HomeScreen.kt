package com.example.smartfinance.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.smartfinance.presentation.components.DynamicList
import com.example.smartfinance.presentation.components.IconButtonWithText
import com.example.smartfinance.ui.theme.Typography


@Composable
fun HomeScreen () {
    var currentProgress by remember { mutableStateOf(0.3f) }

        Column(
//            modifier = Modifier
//                .padding(10.dp)
        ) {

            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                val (profileIcon, profileName, settingsIcon, notificationIcon,
                    availabilityTxt, balanceTxt, transferLimitTxt, transferLimitValueTxt,
                    progressBar, amountSpentTxt, payButton, depositButton) = createRefs()

                Icon(
                    Icons.Default.AccountCircle,
                    contentDescription = "profile picture",
                    modifier = Modifier
                        .size(50.dp)
                        .constrainAs(profileIcon) {
                            top.linkTo(parent.top, margin = 16.dp)
                            start.linkTo(parent.start)
                        }
                )

                Text(
                    text = "Adam Sing",
                    style = Typography.bodyLarge,
                    modifier = Modifier.constrainAs(profileName) {
                        top.linkTo(profileIcon.top)
                        start.linkTo(profileIcon.end, margin = 16.dp)
                        bottom.linkTo(profileIcon.bottom)
                    }
                )

                Icon(
                    Icons.Default.Settings,
                    contentDescription = "settings",
                    modifier = Modifier
                        .size(30.dp)
                        .constrainAs(settingsIcon) {
                            top.linkTo(profileIcon.top)
                            end.linkTo(parent.end, margin = 16.dp)
                            bottom.linkTo(profileIcon.bottom)
                        }
                )

                Icon(
                    Icons.Default.Notifications,
                    contentDescription = "notifications",
                    modifier = Modifier
                        .size(30.dp)
                        .constrainAs(notificationIcon) {
                            top.linkTo(profileIcon.top)
                            end.linkTo(settingsIcon.start, margin = 16.dp)
                            bottom.linkTo(profileIcon.bottom)
                        }
                )

                Text(
                    text = "Available on card",
                    style = Typography.bodyMedium,
                    modifier = Modifier
                        .constrainAs(availabilityTxt) {
                            top.linkTo(profileIcon.bottom, margin = 16.dp)
                            start.linkTo(parent.start)
                        }
                )

                Text(
                    text = "$20, 000",
                    style = Typography.displayLarge,
                    modifier = Modifier
                        .constrainAs(balanceTxt) {
                            top.linkTo(availabilityTxt.bottom, margin = 16.dp)
                            start.linkTo(parent.start)
                        }
                )

                Text(
                    text = "Transfer Limit",
                    style = Typography.labelLarge,
                    modifier = Modifier
                        .constrainAs(transferLimitTxt) {
                            top.linkTo(balanceTxt.bottom, margin = 16.dp)
                            start.linkTo(parent.start)
                        }
                )

                Text(
                    text = "$12, 000",
                    style = Typography.labelLarge,
                    modifier = Modifier
                        .constrainAs(transferLimitValueTxt) {
                            top.linkTo(transferLimitTxt.top)
                            end.linkTo(parent.end, margin = 16.dp)
                            bottom.linkTo(transferLimitTxt.bottom)
                        }
                )

                LinearProgressIndicator(
                    progress = { currentProgress },
                    modifier = Modifier
                        .fillMaxWidth()
                        .constrainAs(progressBar) {
                            top.linkTo(transferLimitTxt.bottom, margin = 16.dp)
                        }
                )

                Text(
                    text = "spent $1, 345",
                    style = Typography.bodyMedium,
                    modifier = Modifier
                        .constrainAs(amountSpentTxt) {
                            top.linkTo(progressBar.bottom, margin = 16.dp)
                        }
                )

                IconButtonWithText(
                    buttonText = "Pay",
                    icon = {
                        Icon(
                            Icons.Default.AttachMoney,
                            contentDescription = "pay"
                        )
                           },
                    onClick = {},
                    modifier = Modifier
                        .padding(8.dp)
                        .width(180.dp)
                        .constrainAs(payButton) {
                        top.linkTo(amountSpentTxt.bottom, margin = 16.dp)
                    },
                    buttonColor = Color.Black
                )

                IconButtonWithText(
                    buttonText = "Deposit",
                    icon = {
                        Icon(
                            Icons.Default.AttachMoney,
                            contentDescription = "deposit"
                        )
                    },
                    onClick = {},
                    modifier = Modifier
                        .padding(8.dp)
                        .width(180.dp)
                        .constrainAs(depositButton) {
                            top.linkTo(payButton.top)
                            end.linkTo(parent.end)
                        },

                    buttonColor = Color.Black
                )
            }

            DynamicList()
        }
}