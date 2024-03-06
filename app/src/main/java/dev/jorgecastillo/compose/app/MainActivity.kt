@file:OptIn(ExperimentalAnimationGraphicsApi::class, ExperimentalTime::class)

package dev.jorgecastillo.compose.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi
import dev.jorgecastillo.compose.app.ui.composables.MainScreen
import dev.jorgecastillo.compose.app.ui.theme.ComposeAndInternalsTheme
import kotlin.time.ExperimentalTime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAndInternalsTheme {
                MainScreen()
            }
        }
    }
}
