package dev.thiagopereirati.marvelkmm.android.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColors(
    primary = Color.DarkGray,
    primaryVariant = Color(0xFF1D1D1D)
)

@Composable
fun MarvelTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColors,
        content = content
    )
}