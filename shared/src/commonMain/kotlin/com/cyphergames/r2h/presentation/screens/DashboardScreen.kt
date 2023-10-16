package com.cyphergames.r2h.presentation.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.cyphergames.r2h.style.Palette

@Composable
fun DashboardScreen() {
     var surfaceHeight by remember { mutableStateOf(0.dp) }
     var surfaceWidth by remember { mutableStateOf(0.dp) }
     var surfaceSize by remember { mutableStateOf(IntSize.Zero)}

     surfaceHeight = surfaceSize.height.dp
     surfaceWidth = surfaceSize.width.dp

     val pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f,10f),0f)

     Surface(modifier = Modifier.fillMaxSize()
          .onGloballyPositioned { surfaceSize = it.size
          },
          color = Palette.Turquoise
     ) {

          Column(
               modifier = Modifier.height(surfaceHeight / 2).fillMaxWidth(),
               verticalArrangement = Arrangement.Bottom
          ) {

               Card(
                    modifier = Modifier.height(surfaceHeight / 2 / 12).fillMaxWidth()
                         .padding(14.dp),
                    backgroundColor = Palette.White,
                    elevation = 25.dp,
                    shape = RoundedCornerShape(20.dp)
               ) {
                    Column(
                         modifier = Modifier.fillMaxSize(),
                         horizontalAlignment = Alignment.Start,
                         verticalArrangement = Arrangement.SpaceEvenly
                    ) {

                         Text(modifier = Modifier.padding(4.dp), text = "pick-up: ")
                         Canvas(modifier = Modifier.fillMaxWidth().height(1.dp)) {
                              drawLine(
                                   color = Palette.PakGreen,
                                   start = Offset(0f, size.height / 2),
                                   end = Offset(size.width, size.height / 2),
                                   pathEffect = pathEffect
                              )
                         }
                         Text(modifier = Modifier.padding(4.dp), text = "drop-off: ")
                    }
               }
               Card(
                    modifier = Modifier.height(surfaceHeight / 2 / 4).fillMaxWidth().padding(14.dp),
                    backgroundColor = Palette.White,
                    elevation = 10.dp,
                    shape = RoundedCornerShape(24.dp)
               ) {
                    LazyRow(
                         modifier = Modifier.fillMaxSize()
                    )
                    {
                         items(20){
                              it -> CardTile(it)
                         }

                    }
               }

          }


     }
}




@Composable
fun CardTile(value: Int){
     Card(modifier = Modifier.size(100.dp).padding(10.dp),
          backgroundColor = Palette.PakGreen,
          elevation = 10.dp,
          shape = RoundedCornerShape(12.dp),
     ) {
          Text(modifier = Modifier.wrapContentHeight(Alignment.CenterVertically),
               textAlign = TextAlign.Center,
               text = "Tile $value")
     }
}

