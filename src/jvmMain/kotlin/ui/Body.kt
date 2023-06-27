package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.sharp.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Body() {
    var text by remember { mutableStateOf("Hello, World!") }
    var num = 0

    Column {

        Button(onClick = {
            num++
            text = "Hello, Desktop! $num"
        }) {
            Text(text)
        }
        Text(text="hello world", modifier = Modifier.padding(20.dp))

        Row {
            Icon(Icons.Outlined.ArrowBack, "arrow back")
            Icon(Icons.Sharp.Add, "add")
            Icon(Icons.Sharp.Close, "close")

            Card {
                Icon(Icons.Outlined.ArrowBack, "arrow back")
            }
            Card {
                Icon(Icons.Outlined.ArrowBack, "arrow back")
            }
            Card {
                Icon(Icons.Outlined.ArrowBack, "arrow back")
            }
        }

        Row {
            Tag("hello")
        }
    }
}

@Composable
fun Tag(text: String): Unit {
    Text(text)
}