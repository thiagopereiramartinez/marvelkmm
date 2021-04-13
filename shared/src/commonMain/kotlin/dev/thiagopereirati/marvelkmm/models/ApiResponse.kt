package dev.thiagopereirati.marvelkmm.models

data class ApiResponse<T>(
    val code: Int,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val etag: String,
    val data: DataContainer<T>
) {

    data class DataContainer<T>(
        val offset: Int,
        val limit: Int,
        val total: Int,
        val count: Int,
        val results: List<T>
    )

}