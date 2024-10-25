package com.ahmet.movies.movieList.data.remote.response

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ahmet.movies.movieList.data.local.movie.MovieDao
import com.ahmet.movies.movieList.data.local.movie.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}