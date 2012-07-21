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
    public void showMenuTest(){                       //requirement 2
           Menu menu= new Menu(1,"Display Books");
          // Menu reserve=new Menu(2,"Reserve Books");
            String display=menu.showMenu();
            Assert.assertEquals(menu.disp,display);

    }

        @Test
        public void pickMenuTest(){                     //requirement 3 and 4
            Menu menu=new Menu(1,"Display");
            String message=menu.pickMenu(1);
            Assert.assertSame("Success",message);
            String message1=menu.pickMenu(2);
            Assert.assertSame("Success",message1);
            String message2=menu.pickMenu(5);
            Assert.assertSame("Select a valid option",message2);
        }
    /*public void pickMenuTest(){
             Menu menu=new Menu(1,"display");
             Boolean displayresult = menu.pickMenu(1);
            Assert.assertEquals((Object) true,displayresult);
            Boolean reserveresult = menu.pickMenu(2);
            Assert.assertEquals((Object) true,reserveresult);
            Boolean checkresult = menu.pickMenu(3);
            Assert.assertEquals((Object) true,checkresult);
    } */


}
