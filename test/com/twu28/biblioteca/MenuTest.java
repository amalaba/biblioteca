package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {
   /* @Test
    public void showMenuNameTest(){
        Assert.assertEquals("Menu",new Menu(1,"display").showMenuName());
    }
*/
    @Test
    public void shouldShowMenu(){
            Menu show_book = new Menu(1, "show Books");
            Menu reserve_book = new Menu(2, "reserve");
            Assert.assertEquals("show Books",show_book.showMenu(show_book));
            Assert.assertEquals("reserve",reserve_book.showMenu(reserve_book));
            }

}
