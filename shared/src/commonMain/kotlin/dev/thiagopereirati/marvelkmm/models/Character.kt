package dev.thiagopereirati.marvelkmm.models

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val modified: String,
    val resourceURI: String,
    val urls: List<Url>? = null,
    val thumbnail: Thumbnail,
    val comics: ResourceList<ComicSummary>? = null,
    val stories: ResourceList<StorySummary>? = null,
    val events: ResourceList<EventSummary>? = null,
    val series: ResourceList<SeriesSummary>? = null,
)