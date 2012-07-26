package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class MenuTest {

    @Test
    public void shouldShowMenu(){
            Menu show_book = new Menu(1, "show Books");
            Menu reserve_book = new Menu(2, "reserve");
            Assert.assertEquals("show Books",show_book.showMenu(show_book));
            Assert.assertEquals("reserve",reserve_book.showMenu(reserve_book));
            }

}
