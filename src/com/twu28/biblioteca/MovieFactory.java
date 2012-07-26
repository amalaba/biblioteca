package com.twu28.biblioteca;

import java.util.ArrayList;


public class MovieFactory {

    public ArrayList<Movie> createMovieDetails() {
        ArrayList<Movie> movies = new ArrayList();
        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", "gfgdfg", 9.2);
        Movie theGodfather = new Movie("The Godfather", "gfgdfg", 9.0);
        Movie theGodfatherPartII = new Movie("The Godfather: Part II ", "fgdfg", 8.8);
        Movie pulpFiction = new Movie("Pulp Fiction ", "fgdg", 8.5);
        Movie theGoodTheBadAndTheUgly = new Movie("The Good, the Bad and the Ugly", "fhhgh", 8.1);
        Movie twelveAngryMen = new Movie("12 Angry Men", "ghhghhh", 7.7);
        Movie schindlersList = new Movie("Schindler's List ", "ghgghgh", 7.9);
        Movie theDarkKnight = new Movie("The Dark Knight", "hjhjhj", 7.6);
        Movie theDarkKnightRises = new Movie("The Dark Knight Rises", "ghhghh", 0.0);
        Movie theLordOfTheRingsTheReturnofTheKing = new Movie("The Lord of the Rings: The Return of the King ", "hhghgh", 6.5);
        Movie fightClub = new Movie("Fight Club ", "ggsdfs", 6.2);
        Movie oneFlewOverTheCuckoosNest = new Movie("One Flew Over the Cuckoo\'s Nest ", "gfgdgdf", 6.0);
        Movie Inception = new Movie("Inception ", "hjshfsj", 6.0);
        Movie goodFellas = new Movie("Goodfellas", "hfjshf", 5.9);
        Movie starWars = new Movie("Star Wars ", "shfjshf", 5.7);

        movies.add(theShawshankRedemption);
        movies.add(theGodfather);
        movies.add(theGodfatherPartII);
        movies.add(pulpFiction);
        movies.add(theGoodTheBadAndTheUgly);
        movies.add(twelveAngryMen);
        movies.add(schindlersList);
        movies.add(theDarkKnight);
        movies.add(theDarkKnightRises);
        movies.add(theLordOfTheRingsTheReturnofTheKing);
        movies.add(fightClub);
        movies.add(oneFlewOverTheCuckoosNest);
        movies.add(Inception);
        movies.add(goodFellas);
        movies.add(starWars);

        return movies;
    }
}
