package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.awt.print.Book;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {
    @Test
    public void showMenuNameTest(){
        Assert.assertEquals("Menu",new Menu(1,"display").showMenuName());
    }

    @Test
    public void showMenuTest(){
           Menu menu= new Menu(1,"Display Books");
          // Menu reserve=new Menu(2,"Reserve Books");
            Boolean choice=menu.showMenu(1);
            Assert.assertEquals((Object) true,choice);

    }


}
