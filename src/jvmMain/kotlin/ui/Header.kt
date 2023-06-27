package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Column {
        Text(text="header", fontSize = 40.sp)
        SubHeader()
    }
}

@Composable
fun SubHeader() {
    Text("sub header")
}