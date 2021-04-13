package dev.thiagopereirati.marvelkmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.thiagopereirati.marvelkmm.Greeting
import dev.thiagopereirati.marvelkmm.android.ui.theme.MarvelTheme
import dev.thiagopereirati.marvelkmm.remote.CharactersService
import dev.thiagopereirati.marvelkmm.repository.CharactersRepository
import kotlinx.coroutines.runBlocking
import org.koin.android.ext.android.get

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val charactersService: CharactersService = get()
        val repo = CharactersRepository(charactersService)

        runBlocking {
            println(repo.getCharacters())
        }

        setContent {
            MarvelTheme {
                MarvelHome()
            }
        }
    }
}

@Composable
fun MarvelHome() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(stringResource(R.string.app_name)) })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(greet())
        }
    }
}

@Preview
@Composable
fun MarvelHomePreview() {
    MarvelTheme {
        MarvelHome()
    }
}
