package com.ahmet.movies.movieList.util

sealed class Screen(val route: String){
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
}