package com.submission2.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.submission2.core.data.Resource
import com.submission2.core.domain.model.Movie
import com.submission2.core.domain.usecase.MovieAppUseCase

class MoviesViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {
    fun getMovies(sort: String): LiveData<Resource<List<Movie>>> =
        movieAppUseCase.getAllMovies(sort).asLiveData()
}