package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {


    public String showWelcome() {
        return "Welcome..";
    }


    public Book getBookName(ArrayList<Book> books, String book_name) {
        for (Book book : books) {
            if (book.name.equals(book_name)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Application application = new Application();
        System.out.println(application.showWelcome());
        LoginFactory loginFactory= new LoginFactory();
        ArrayList<Login> logins=new ArrayList<Login>();
        loginFactory.createLoginDetails();
        BookFactory bookFactory = new BookFactory();
        MovieFactory movieFactory = new MovieFactory();
        ArrayList<Movie> movies = movieFactory.createMovieDetails();
        ArrayList<Book> books = bookFactory.createBooks();
        MenuAction menuAction = new MenuAction(books, movies,logins);
        menuAction.doLoginFunction();
        menuAction.doMenuFunction();

        }
}
