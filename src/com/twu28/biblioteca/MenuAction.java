package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MenuAction {
    public String userName;
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<Login> logins=new ArrayList<Login>();
    MenuFactory menuFactory = new MenuFactory();
    ArrayList<Menu> menu = menuFactory.createMenu();
    public MenuAction(ArrayList<Book> books, ArrayList<Movie> movies,ArrayList<Login> logins) {
        this.books = books;
        this.movies = movies;
        this.logins=logins;
    }


    public void doMenuFunction() {
        int choice;
        do {
            System.out.println("MENU");
            for (Menu menu_item : menu) {
                System.out.println(menu_item.showMenu(menu_item));
            }
            BufferedReader read_choice = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader read_lib_no = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader read_book_to_reserve = new BufferedReader(new InputStreamReader(System.in));
            Application application = new Application();
            choice = 0;
            try {
                choice = read_choice.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int Lib_no = 0;
            String book_name = null;
            Book book_to_reserve = new Book("null", "null");
            Boolean reserve_status = true;


            switch (choice) {
                case '1': {
                    for (Book book : books) {
                        System.out.println(book.showBooks());
                    }
                    break;
                }
                case '2':
                    System.out.println("Enter book name");
                    try {
                        book_name = read_book_to_reserve.readLine();
                        book_to_reserve = application.getBookName(books, book_name);
                        reserve_status = book_to_reserve.reserve();
                        if (reserve_status == true) {
                            System.out.println("book reserved.. enjoy");
                        } else
                            System.out.println("sorry v do not hav that book..");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    break;
                case '3':
                    System.out.println("user:"+checkLibNo());
                    break;
                case '4':
                    for (Movie movie : movies) {
                        System.out.println(movie.showMovieDetails());
                    }
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        } while (choice != '5');
    }

    public void doLoginFunction() {
        LoginFactory loginFactory=new LoginFactory();
        System.out.println("Enter username an passsword");
        userName=loginFactory.readUserName();
        String password=loginFactory.readPassword();
        System.out.println(loginFactory.loginAction(logins,userName,password));
    }
    public String checkLibNo() {
         return userName;
    }
}
