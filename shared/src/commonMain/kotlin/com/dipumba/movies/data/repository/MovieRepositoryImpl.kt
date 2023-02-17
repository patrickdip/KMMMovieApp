package com.dipumba.movies.data.repository

import com.dipumba.movies.data.remote.RemoteDataSource
import com.dipumba.movies.data.util.toMovie
import com.dipumba.movies.domain.model.Movie
import com.dipumba.movies.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}