package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {


    public String showWelcome() {
        return "Welcome..";
    }


    public String checkLibNo(int libno) {
        return "Please contact the librarian";
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
        BookFactory bookFactory = new BookFactory();
        MovieFactory movieFactory = new MovieFactory();
        ArrayList<Movie> movies = movieFactory.createMovieDetails();
        ArrayList<Book> books = bookFactory.createBooks();
        MenuFactory menuFactory = new MenuFactory();
        ArrayList<Menu> menu = menuFactory.createMenu();
        System.out.println("MENU");
        for (Menu menu_item : menu) {
            System.out.println(menu_item.showMenu(menu_item));
        }
        MenuAction menuAction = new MenuAction(books, movies);
        menuAction.doMenuFunction();

    }
}
