package com.twu28.biblioteca;

import java.util.ArrayList;

public class MenuFactory {
    public ArrayList<Menu> createMenu() {
        ArrayList<Menu> menu = new ArrayList<Menu>();
        Menu show_book = new Menu(1, "show Books");
        Menu reserve_book = new Menu(2, "reserve");
        Menu check_lib_no = new Menu(3, "Check library no");
        Menu viewMovies = new Menu(4, "View Movies");
        Menu exit = new Menu(5, "Exit");
        menu.add(show_book);
        menu.add(reserve_book);
        menu.add(check_lib_no);
        menu.add(viewMovies);
        menu.add(exit);
        return menu;
    }
}
