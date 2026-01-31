package com.example.goldenyears.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.goldenyears.components.BottomButton
import com.example.goldenyears.components.titleThing

@Composable
fun LoginScreen(onNavigateToHome: () -> Unit) {
    var email by remember { mutableStateOf("email") }
    var password by remember { mutableStateOf("password") }

    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        titleThing(modifier = Modifier
            .background(Color.White)
            .weight(1f)
            .fillMaxSize())

        Column(
            verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.White)
        ) {
            Text("This is login page 1")
            TextField(value = email, onValueChange = { email = it })
            TextField(value = password, onValueChange = { password = it })
        }
        BottomButton("Continue", null, { onNavigateToHome()})
    }
}