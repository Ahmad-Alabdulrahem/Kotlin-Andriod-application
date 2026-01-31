package com.example.goldenyears.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
fun SignupScreen(onNavigateToHome: () -> Unit, onNavigateToLogin: () -> Unit) {
    var text by remember { mutableStateOf("Enter your name here...") }
    var state by remember {
        mutableIntStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        titleThing(modifier = Modifier
            .background(Color.White)
            .weight(1f)
            .fillMaxSize()
        )

// Maybe try to do something like this for changing where in the signup process is.
//        when (state) {
//            0 -> Extracted(text, onNavigateToHome, Modifier.weight(1f))
//            1 -> Extracted2(text, onNavigateToHome, Modifier.weight(1f))
//        }
        // Instead of this
        Extracted(text, onNavigateToHome, Modifier.weight(1f))

        BottomButton("Login", null, { onNavigateToLogin() })
    }
}

@Composable
private fun Extracted(text: String, onNavigateToHome: () -> Unit, modifier: Modifier = Modifier) {
    var text1 = text
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text("This is signup page 1 - you input name here")
        TextField(value = text1, onValueChange = { text1 = it })
        Button(onClick = { onNavigateToHome() }) {
            Text("Continue (with sign up) - $text1")
        }
    }
}


@Composable
private fun Extracted2(text: String, onNavigateToHome: () -> Unit, modifier: Modifier = Modifier) {
    var text1 = text
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text("Hello ${text}!")
        Text("This is signup page 1 - you input name here")
        TextField(value = text1, onValueChange = { text1 = it })
        Button(onClick = { onNavigateToHome() }) {
            Text("Continue (with sign up) - $text1")
        }
    }
}