package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 2:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    String name;
    String author;
    private boolean bookreserved=false;

      public Book(String name,String author){
          this.name=name;
          this.author=author;
      }


   /* public String showBooks() {
        Book book = new Book();                                //return disp
        return book.disp;
        // Book book = new Book();
        // book.showBooks();
        //return true;  //To change body of created methods use File | Settings | File Templates.
    }
        */                                                                      //no setter

    public boolean reserve(Book book_to_reserve) {
        if(book_to_reserve.bookreserved==false)
        {  book_to_reserve.bookreserved=true;
            return true;  //To change body of created methods use File | Settings | File Templates.
        }
        else
            return false;
    }

    public String showBooks(Book book) {
        String whole_book_detail;
        whole_book_detail=book.name+":"+book.author;
        return whole_book_detail;  //To change body of created methods use File | Settings | File Templates.

    }

}
