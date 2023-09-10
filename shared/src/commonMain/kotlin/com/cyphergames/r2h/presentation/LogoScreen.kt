package com.cyphergames.r2h.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LogoScreen(){
    Surface(modifier = Modifier.fillMaxSize(),
            color = Color(0,120,0)) {

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "r2h",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 80.sp,
                color = Color.White
            )

            LinearProgressIndicator(
                color = Color.Black


            )
        }

    }
}