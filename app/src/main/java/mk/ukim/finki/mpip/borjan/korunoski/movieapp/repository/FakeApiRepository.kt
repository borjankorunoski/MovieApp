package mk.ukim.finki.mpip.borjan.korunoski.movieapp.repository

import mk.ukim.finki.mpip.borjan.korunoski.movieapp.model.Movie

class FakeApiRepository() {
    private var movieList: MutableList<Movie> = ArrayList()

    init {
        for (i in 25 downTo 0) {
            val movie: Movie = Movie(1L, "Movie name $i", "Movie description $i", "Movie director $i", "Movie actors $i")
            movieList.add(movie)
        }
    }

    public fun getMovies(): MutableList<Movie> {
        return movieList;
    }

    public fun addMovie(movie: Movie) {
        movieList.add(movie)
    }
}