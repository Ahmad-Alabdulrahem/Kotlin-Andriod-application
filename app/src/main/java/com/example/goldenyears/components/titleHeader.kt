package com.example.goldenyears.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import com.example.goldenyears.R


@Composable
fun titleThing(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 20.dp)
        //.background(Color.Blue),

    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(-20.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                //.background(color = Color(0xFF0FFFFF))
                .weight(1f)
                .fillMaxHeight()
        ) {
            // Top text
            Text(
                text = "Welcome to",
                style = TextStyle(
                    fontSize = 24.sp,
                    //fontFamily = FontFamily(Font(R.font.jost)),
                    fontWeight = FontWeight(400),
                    color = MaterialTheme.colorScheme.secondary,
                ),
                modifier = Modifier
                    .width(122.dp)
                    .height(35.dp)
            )
            // Bottom text
            Text(
                text = stringResource(id = R.string.app_name),
                style = TextStyle(
                    fontSize = 48.sp,
                    //fontFamily = FontFamily(Font(R.font.)),
                    fontWeight = FontWeight(400),
                    color = MaterialTheme.colorScheme.secondary,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(253.dp)
                    .height(69.dp)
            )
        }
    }
}

