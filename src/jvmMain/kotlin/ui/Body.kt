package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Body() {
    var text by remember { mutableStateOf("Hello, World!") }
    var num = 0

    Column {
        Text("body")
        Button(onClick = {
            num++
            text = "Hello, Desktop! $num"
        }) {
            Text(text)
        }
        Text(text="hello world", modifier = Modifier.padding(20.dp))
    }
}