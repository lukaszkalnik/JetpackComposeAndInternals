package dev.jorgecastillo.compose.app.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.jorgecastillo.compose.app.data.FakeSpeakerRepository
import dev.jorgecastillo.compose.app.models.Speaker
import dev.jorgecastillo.compose.app.ui.theme.ComposeAndInternalsTheme

@Composable
fun LazySpeakersScreen(speakers: List<Speaker>) {
    Scaffold(
        topBar = {
            TopAppBar {
                Text(
                    text = "Speakers",
                    modifier = Modifier.padding(16.dp),
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(painter = rememberVectorPainter(image = Icons.Default.Add), contentDescription = null)
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .testTag("SpeakersList")
        ) {
            items(speakers) { speaker ->
                SpeakerCard(speaker = speaker)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun LazySpeakersScreenPreview() {
    ComposeAndInternalsTheme {
        LazySpeakersScreen(speakers = FakeSpeakerRepository().getSpeakers())
    }
}
