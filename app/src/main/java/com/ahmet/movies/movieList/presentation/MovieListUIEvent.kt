package com.ahmet.movies.movieList.presentation

sealed interface MovieListUIEvent {
    data class Paginate(val category: String) : MovieListUIEvent
    object Navigate : MovieListUIEvent
}