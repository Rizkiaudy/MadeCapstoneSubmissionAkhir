package com.submission2.detail

import androidx.lifecycle.ViewModel
import com.submission2.core.domain.model.Movie
import com.submission2.core.domain.usecase.MovieAppUseCase

class DetailViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) {
        movieAppUseCase.setMovieFavorite(movie, newStatus)
    }
}
