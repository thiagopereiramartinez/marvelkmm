package dev.thiagopereirati.marvelkmm.remote

import dev.thiagopereirati.marvelkmm.models.ApiResponse
import dev.thiagopereirati.marvelkmm.models.Character

actual interface CharactersService {

    actual suspend fun getCharacters(): ApiResponse<Character>

}