package dev.thiagopereirati.marvelkmm.remote

import retrofit2.http.*
import dev.thiagopereirati.marvelkmm.models.ApiResponse
import dev.thiagopereirati.marvelkmm.models.Character

actual interface CharactersService {

    @GET("/v1/public/characters")
    actual suspend fun getCharacters(): ApiResponse<Character>

}