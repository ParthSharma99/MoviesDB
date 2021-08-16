package com.movieDBInshorts.project.movies.network.models

class ReviewApiResponse {
    var results: List<Review>? = null

    constructor() {}

    constructor(results: List<Review>) {
        this.results = results
    }
}
