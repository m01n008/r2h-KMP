package com.cyphergames.r2h.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cyphergames.r2h.style.Palette

@Composable
fun LogoScreen(){
    Surface(modifier = Modifier.fillMaxSize(),
            color = Palette.PakGreen) {

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "r2h",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 80.sp,
                color = Palette.White
            )

            LinearProgressIndicator(
                color = Palette.Black


            )

        }

    }
}