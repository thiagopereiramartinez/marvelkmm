package dev.thiagopereirati.marvelkmm.remote

import dev.thiagopereirati.marvelkmm.models.ApiResponse
import dev.thiagopereirati.marvelkmm.models.Character

expect interface CharactersService {

    suspend fun getCharacters(): ApiResponse<Character>

}