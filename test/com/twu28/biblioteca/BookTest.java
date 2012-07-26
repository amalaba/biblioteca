package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest{
    @Test
    public void showDisplayBooks(){
        Book far_from_madding_crowd = new Book("far from the madding crowd", "Thomas Hardy");
        Book deception_point = new Book("deception point", "Dan Brown");
        Assert.assertEquals("far from the madding crowd"+":"+"Thomas Hardy",far_from_madding_crowd.showBooks());
        Assert.assertEquals("deception point"+":"+"Dan Brown",deception_point.showBooks());

    }
    @Test
    public void shouldReserveABook()
    {
        Book book = new Book("Far from the madding crowd","Thomas hardy");
         Assert.assertEquals(true,book.reserve());
    };

    @Test
    public void shouldNotReserveABookIfAlreadyReserved()
    {
        Book book = new Book("Far from the madding crowd","Thomas Hardy");
        Assert.assertEquals(true,book.reserve());
        Assert.assertEquals(false,book.reserve());
    };
}
