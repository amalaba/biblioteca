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


    public String checkLibNo(int libno) {
        return "Please contact the librarian";  //To change body of created methods use File | Settings | File Templates.
    }
    public Book getBookName(ArrayList<Book> books,String book_name){
        for( Book book:books){
            if(book.name.equals(book_name)){
                return book;
            }
        }
        return null;
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
        Menu check_lib_no = new Menu(3, "Check library no");
        Menu exit=new Menu(4,"exit");
        menu.add(show_book);
        menu.add(reserve_book);
        menu.add(check_lib_no);
        menu.add(exit);
//        String item;
        System.out.println("MENU");
        for(Menu menu_item: menu){
           System.out.println(menu_item.showMenu(menu_item));
        }
        BufferedReader read_choice = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read_lib_no = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read_book_to_reserve = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        try {
            choice = read_choice.read();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
//        show_book.pickMenu(choice);      //check....
        int Lib_no = 0;
        String book_name=null;
        Book book_to_reserve=new Book("null","null");
        Boolean reserve_status=true;
         switch(choice){
             case '1':{ for(Book book:books){
                     System.out.println(book.showBooks(book));
                     }
                 break;
             }
             case '2': System.out.println("Enter book name");
                 try {
                     book_name=read_book_to_reserve.readLine();
                      book_to_reserve=application.getBookName(books,book_name);
                     reserve_status= book_to_reserve.reserve(book_to_reserve);
                     if(reserve_status==true){
                         System.out.println("book reserved.. enjoy");
                     }
                     else
                         System.out.println("sorry v do not hav that book..");

                     } catch (IOException e) {
                     e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                 }

                       //check
                    break;
             case '3': System.out.println("Enter ibrary no...");
                 try {
                     System.out.println("fhghgh");
                     Lib_no=read_lib_no.read();
                 } catch (IOException e) {
                     e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                 }
                 System.out.println(application.checkLibNo(Lib_no));
                 break;
             case '4': System.exit(0);
                    break;
             default:System.out.println("Invalid choice");


             }
         }

    }
