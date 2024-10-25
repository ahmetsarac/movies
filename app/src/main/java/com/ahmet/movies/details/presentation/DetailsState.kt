package com.ahmet.movies.details.presentation

import com.ahmet.movies.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
