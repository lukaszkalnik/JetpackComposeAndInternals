package dev.jorgecastillo.compose.app.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    Scaffold(topBar = {
        TopAppBar {
            Text(text = "Speakers App")
        }
    }) { paddingValues ->
        val navController = rememberNavController()

        val speakersRoute = "speakers"

        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            startDestination = speakersRoute
        ) {
            val speakerRoute = "speaker"

            composable(speakersRoute) {
                SpeakerFeed(
                    onSpeakerClick = { speaker ->
                        navController.navigate("$speakerRoute/${speaker.id}")
                    }
                )
            }

            val speakerIdArg = "speakerId"
            composable("$speakerRoute/{$speakerIdArg}") { backStackEntry ->
                SpeakerProfileScreen(
                    speakerId = backStackEntry.arguments?.getString(speakerIdArg)
                )
            }
        }
    }
}
