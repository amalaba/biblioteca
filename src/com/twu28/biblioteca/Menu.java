package com.twu28.biblioteca;

import java.util.zip.CheckedInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {


    public String disp;

    public Menu(int slno, String menuitem) {
    }

    public String showMenuName() {
        return "Menu";  //To change body of created methods use File | Settings | File Templates.
    }

    public String showMenu() {
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

    }

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

    public String pickMenu(int choice) {
        if(choice<=3&&choice>=1)
            return "Success" ;
        else
            return "Select a valid option";

        }
}
