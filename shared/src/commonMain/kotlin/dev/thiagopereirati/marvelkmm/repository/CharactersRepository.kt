package dev.thiagopereirati.marvelkmm.repository

import dev.thiagopereirati.marvelkmm.remote.CharactersService

class CharactersRepository(private val service: CharactersService) {

    suspend fun getCharacters() = service.getCharacters()

}