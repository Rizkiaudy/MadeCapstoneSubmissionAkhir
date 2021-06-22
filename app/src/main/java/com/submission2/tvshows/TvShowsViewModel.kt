package com.submission2.tvshows

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.submission2.core.data.Resource
import com.submission2.core.domain.model.Movie
import com.submission2.core.domain.usecase.MovieAppUseCase

class TvShowsViewModel(private val movieAppUseCase: MovieAppUseCase) : ViewModel() {
    fun getTvShows(sort: String): LiveData<Resource<List<Movie>>> =
        movieAppUseCase.getAllTvShows(sort).asLiveData()
}