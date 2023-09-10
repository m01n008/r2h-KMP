package com.cyphergames.r2h.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice
import platform.UIKit.UIViewController

fun MainViewiOSController(): UIViewController {
    val deviceiOS = UIDevice.currentDevice().name
    val spacerSize = Modifier.height(if (deviceiOS.contains("14")) 40.dp else 0.dp)

    val uiViewController = ComposeUIViewController {
        Column {
          //  Spacer(modifier = spacerSize)
            CommonView()
        }
    }

    return uiViewController
}
