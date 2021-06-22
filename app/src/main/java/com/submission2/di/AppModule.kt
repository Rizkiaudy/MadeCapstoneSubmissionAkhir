package com.submission2.di

import com.submission2.core.domain.usecase.MovieAppInteractor
import com.submission2.core.domain.usecase.MovieAppUseCase
import com.submission2.detail.DetailViewModel
import com.submission2.home.SearchViewModel
import com.submission2.movies.MoviesViewModel
import com.submission2.tvshows.TvShowsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val useCaseModule = module {
    factory<MovieAppUseCase> { MovieAppInteractor(get()) }
}

@ExperimentalCoroutinesApi
@FlowPreview
val viewModelModule = module {
    viewModel { MoviesViewModel(get()) }
    viewModel { TvShowsViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}