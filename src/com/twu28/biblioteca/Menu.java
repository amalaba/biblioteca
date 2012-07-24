package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.zip.CheckedInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    public int sl_no;
    public String menu_item;

    public Menu(int sl_no, String menu_item) {
        this.sl_no=sl_no;
        this.menu_item=menu_item;
    }



    /*public String showMenuName() {
        return "Menu";  //To change body of created methods use File | Settings | File Templates.
    }*/

    public String showMenu(Menu menu) {
        return menu.menu_item;
        //To change body of created methods use File | Settings | File Templates.
    }
}

/*    public String showMenu() {
        Menu menu = new Menu(1,"item");
        return menu.disp;
       // Book book = new Book();
       // book.showBooks();
        //return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setDisp(String disp) {
        disp="1. show books" +
                "2. Reserve" +
                "3. check library no";

    }*/

  /*  public Boolean pickMenu(int choice) {
        Book book=new Book();
        Boolean result;
        switch (choice)
        {
            case 1:
                    result= book.showBooks();
                    break;
            case 2: result=book.reserve();
                    break;
            case 3: Check check=new Check();
                    int libno=0;
                    result=check.checkLibNo(libno);
            default:return false;
        }
                    return result;

         }*/




