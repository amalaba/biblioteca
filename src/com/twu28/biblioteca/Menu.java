package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.zip.CheckedInputStream;

public class Menu {

    public int sl_no;
    public String menu_item;

    public Menu(int sl_no, String menu_item) {
        this.sl_no = sl_no;
        this.menu_item = menu_item;
    }


    public String showMenu(Menu menu) {
        return menu.menu_item;
    }
}


