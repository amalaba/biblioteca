package com.twu28.biblioteca;


import java.util.ArrayList;

public class BookFactory {

    public BookFactory() {

    }

    public ArrayList<Book> createBooks() {
        ArrayList<Book> books = new ArrayList();
        Book far_from_madding_crowd = new Book("Far from the madding crowd", "Thomas Hardy");
        Book deception_point = new Book("Deception point", "Dan Brown");
        books.add(far_from_madding_crowd);
        books.add(deception_point);
        return books;
    }
}
