package dev.thiagopereirati.marvelkmm.models

data class ComicSummary(
    val name: String,
    val resourceURI: String
)

data class StorySummary(
    val name: String,
    val resourceURI: String,
    val type: String
)

data class EventSummary(
    val name: String,
    val resourceURI: String
)

data class SeriesSummary(
    val name: String,
    val resourceURI: String
)