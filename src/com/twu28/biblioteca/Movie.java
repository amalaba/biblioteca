package com.twu28.biblioteca;


public class Movie {
    String movieName;
    String director;
    Double rating;

    public Movie(String movieName, String director, Double rating) {
        this.movieName = movieName;
        this.director = director;
        this.rating = rating;

    }

    public String showMovieDetails() {
        if (rating == 0)
            return movieName + " " + director + " N/A";
        else
            return movieName + " " + director + " " + rating;

    }

}
