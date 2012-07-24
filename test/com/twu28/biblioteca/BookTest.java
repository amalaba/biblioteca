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
    public void showDisplayBooks(){                       //requirement 5
        Book far_from_madding_crowd = new Book("far from the madding crowd", "Thomas Hardy");
        Book deception_point = new Book("deception point", "Dan Brown");
        Assert.assertEquals("far from the madding crowd"+":"+"Thomas Hardy",far_from_madding_crowd.showBooks(far_from_madding_crowd));
        Assert.assertEquals("deception point"+":"+"Dan Brown",deception_point.showBooks(deception_point));

    }
    @Test
    public void shouldReserveABook()               //requirement      6
    {
        Book book = new Book("Far from the madding crowd","Thomas hardy");
        //   String author = "Author";
        //  String name="name";
        Assert.assertEquals(true,book.reserve());
    };

    @Test
    public void shouldNotReserveABookIfAlreadyReserved()                        //requirement 7
    {
        Book book = new Book("Far from the madding crowd","Thomas Hardy");
        //   String author = "Author";
        //  String name="name";
        Assert.assertEquals(true,book.reserve());
        Assert.assertEquals(false,book.reserve());
    };
}
