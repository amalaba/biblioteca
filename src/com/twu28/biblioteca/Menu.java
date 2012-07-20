package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    public Menu(int slno, String menuitem) {
    }

    public String showMenuName() {
        return "Menu";  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean showMenu(int i) {
        Book book = new Book();
        book.showBooks();
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
