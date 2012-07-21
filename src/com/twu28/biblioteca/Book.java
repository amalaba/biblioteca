package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 2:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    public String disp;
    private boolean bookreserved=false;

    public String showBooks() {
        Book book = new Book();
        return book.disp;
        // Book book = new Book();
        // book.showBooks();
        //return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setDisp(String disp) {
        disp="1.Far From the madding crowd: Thomas Hardy" +
                "2.Not a penny more Not a penny Less: Jeffrey Archer" +
                "3. The Ring : Danielle Steel";

    }
    public boolean reserve() {
        if(bookreserved==false)
        {   bookreserved=true;
            return true;  //To change body of created methods use File | Settings | File Templates.
        }
        else
            return false;
    }
}
