package com.submission2.core.domain.usecase

import com.submission2.core.data.Resource
import com.submission2.core.domain.model.Movie
import com.submission2.core.domain.repository.IMovieAppRepository
import kotlinx.coroutines.flow.Flow

class MovieAppInteractor(private val iMovieAppRepository: IMovieAppRepository) : MovieAppUseCase {

    override fun getAllMovies(sort: String): Flow<Resource<List<Movie>>> =
        iMovieAppRepository.getAllMovies(sort)

    override fun getAllTvShows(sort: String): Flow<Resource<List<Movie>>> =
        iMovieAppRepository.getAllTvShows(sort)

    override fun getFavoriteMovies(sort: String): Flow<List<Movie>> =
        iMovieAppRepository.getFavoriteMovies(sort)

    override fun getSearchMovies(search: String): Flow<List<Movie>> =
        iMovieAppRepository.getSearchMovies(search)

    override fun getSearchTvShows(search: String): Flow<List<Movie>> =
        iMovieAppRepository.getSearchTvShows(search)

    override fun getFavoriteTvShows(sort: String): Flow<List<Movie>> =
        iMovieAppRepository.getFavoriteTvShows(sort)

    override fun setMovieFavorite(movie: Movie, state: Boolean) =
        iMovieAppRepository.setMovieFavorite(movie, state)

}