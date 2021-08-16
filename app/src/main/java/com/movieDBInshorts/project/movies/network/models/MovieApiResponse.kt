package com.movieDBInshorts.project.movies.network.models

import com.movieDBInshorts.project.movies.database.Movie

import java.util.ArrayList

class MovieApiResponse {
    var page: Int = 0
    var total_results: Int = 0
    var total_pages: Int = 0
    var results: ArrayList<Movie>? = null
}
