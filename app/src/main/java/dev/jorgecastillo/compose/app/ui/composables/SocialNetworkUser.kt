package dev.jorgecastillo.compose.app.ui.composables

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SocialNetworkUser(name: String, location: String, onFollow: () -> Unit) {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = name)
            Text(text = location)
        }

        Button(onClick = onFollow) {
            Text(text = "Follow")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SocialNetworkUserPreview() {
    SocialNetworkUser(name = "John Doe", location = "New York City") {
        Log.d("Test", "Clicked!")
    }
}
