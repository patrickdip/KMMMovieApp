package com.dipumba.movies.data.remote

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
internal data class MovieRemote(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseDate: String
)
