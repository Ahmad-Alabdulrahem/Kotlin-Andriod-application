package com.example.goldenyears.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.goldenyears.components.BottomButton
import com.example.goldenyears.components.titleThing
import com.example.goldenyears.ui.theme.GoldenYearsTheme

@Composable
fun SelectFontSizeScreen(onNavigateToSignup: () -> Unit) {
    var selectedIndex by remember { mutableIntStateOf(2) }
    val sizes = listOf("S", "M", "L", "XL", "XXL")

    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        titleThing(modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .weight(1f)
            .fillMaxSize()/*.background(Color.Yellow)*/)
        Column(
            verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .padding(32.dp)
                //.background(Color.Blue)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(4.dp)
            ) {
                for (index in 0 until 5) {
                    Button(
                        onClick = { selectedIndex = index },
                        colors = ButtonDefaults.buttonColors(
                            // TODO Make the colors use MaterialTheme instead of hardcoded colors
                            containerColor = if (selectedIndex == index) Color.Gray else Color.White
                        ),

                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .padding(0.dp)
                            .weight(1f)
                            .aspectRatio(1f, matchHeightConstraintsFirst = true)
                            .fillMaxHeight()
                    ) {
                        Text(
                            sizes[index],
                            color = if (selectedIndex == index) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.primary,
                            //overflow = TextOverflow.Clip,
                            maxLines = 1,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text("You have selected font size: ${sizes[selectedIndex]}")
        }

        BottomButton("Continue", null, onNavigateToSignup, modifier = Modifier.background(MaterialTheme.colorScheme.background))
    }
}

@Preview(showBackground = true)
@Composable
fun SelectFontSizeScreenPreview() {
    GoldenYearsTheme { // Assuming you have a custom theme
        SelectFontSizeScreen(onNavigateToSignup = {})
    }
}
