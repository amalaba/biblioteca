package com.twu28.biblioteca;

import java.util.ArrayList;


public class Book {
    String name;
    String author;
    private boolean bookreserved = false;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public boolean reserve() {
        if (bookreserved == false) {
            bookreserved = true;
            return true;
        } else
            return false;
    }

    public String showBooks() {
        return name + ":" + author;

    }

}
