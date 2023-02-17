package com.dipumba.movies.di

import com.dipumba.movies.data.remote.MovieService
import com.dipumba.movies.data.remote.RemoteDataSource
import com.dipumba.movies.data.repository.MovieRepositoryImpl
import com.dipumba.movies.domain.repository.MovieRepository
import com.dipumba.movies.domain.usecase.GetMovieUseCase
import com.dipumba.movies.domain.usecase.GetMoviesUseCase
import com.dipumba.movies.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












