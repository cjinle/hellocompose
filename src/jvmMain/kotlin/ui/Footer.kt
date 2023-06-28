package ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.CompositionLocalProvider



@Composable
fun Footer() {
    Column {
        BottomAppBar {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
                IconButton(onClick = { println("menu click") }) {
                    Icon(Icons.Filled.Menu, contentDescription = "Localized description")
                }
            }
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { println("icon button click") }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
            }
            IconButton(onClick = { println("icon button2 click") }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
            }
        }

    }
}
