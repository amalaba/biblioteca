package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest{
    @Test
    public void showBooksTest(){                       //requirement 5
        Book book= new Book();
        // Menu reserve=new Menu(2,"Reserve Books");
        String display=book.showBooks();
        Assert.assertEquals(book.disp, display);

    }
    @Test
    public void shouldReserveABook()               //requirement      6
    {
        Book book = new Book();
        //   String author = "Author";
        //  String name="name";
        Assert.assertEquals(true,book.reserve());
    };

    @Test
    public void shouldNotReserveABookIfAlreadyReserved()                        //requirement 7
    {
        Book book = new Book();
        //   String author = "Author";
        //  String name="name";
        Assert.assertEquals(true,book.reserve());
        Assert.assertEquals(false,book.reserve());
    };
}
