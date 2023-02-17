package com.dipumba.movies.domain.repository

import com.dipumba.movies.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}