package com.example.goldenyears.components

import android.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BottomButton(buttonText: String?, optionalSnippet: String?, onButton: () -> Unit, modifier: Modifier = Modifier) {
    var showSnackbar by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = modifier
            .padding(6.5.dp)
            .padding(start = 25.dp, top = 4.dp, end = 25.dp, bottom = 25.dp)
        //.background(Color.Yellow)
        ,

        ) {
        // this is the thin grey line
        Box(modifier = Modifier
            .wrapContentSize()
            .fillMaxWidth()
            .height(2.dp)
            .background(color = Color(0xFF8A8A8A), shape = RoundedCornerShape(size = 5.dp)))
        if (optionalSnippet != null) {
            Text(text = optionalSnippet)
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(start = 37.dp, top = 24.dp, end = 37.dp, bottom = 24.dp)
        ) {
            if (showSnackbar) {
                Snackbar(
                    action = {
                        TextButton(onClick = { showSnackbar = false }) {
                            Text("Dismiss")
                        }
                    }
                ) {
                    Text("Not Implemented Yet")
                }
            }

            Button(onClick = {
                if (onButton != null) {
                    onButton()
                } else {
                    showSnackbar = true
                }
            },
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = buttonText.toString(),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = TextStyle(
                        fontSize = 40.sp,
                        //fontFamily = FontFamily(Font(R.font.jost)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,

                    )
                )
            }
        }
    }
}

