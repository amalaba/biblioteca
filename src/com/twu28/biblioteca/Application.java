package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class Application {




    public String showWelcome() {
        return "Welcome..";  //To change body of created methods use File | Settings | File Templates.
    }

    public ArrayList<Menu> showMenu(ArrayList<Menu>menu){
        return menu;
    }

    public ArrayList<Book> showBook(ArrayList<Book>books){
        return books;
    }
    public static void main(String args[]) {
        Application application = new Application();
        System.out.println(application.showWelcome());
        ArrayList<Book> books= new ArrayList();
        Book far_from_madding_crowd = new Book("Far from the madding crowd","Thomas Hardy");
        Book deception_point = new Book("Deception point","Dan Brown");
        books.add(far_from_madding_crowd);
        books.add(deception_point);
        ArrayList<Menu> menu = new ArrayList<Menu>();
        Menu show_book = new Menu(1, "show Books");
        Menu reserve_book = new Menu(2, "reserve");
        menu.add(show_book);
        menu.add(reserve_book);
//        String item;
        System.out.println("MENU");
        for(Menu menu_item: menu){
//            item=menu_item.showMenu(menu_item);
            System.out.println(menu_item.showMenu(menu_item));

        }
        BufferedReader read_choice = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        try {
            choice = read_choice.read();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
//        show_book.pickMenu(choice);      //check....
        String book_name=null;
         switch(choice){
             case '1': for(Book book:books){
                     System.out.println(book.showBooks(book));
                    break; }
             case '2': far_from_madding_crowd.reserve();       //check
                    break;
             default:System.out.println("Invalid choice");


             }
         }

    }
