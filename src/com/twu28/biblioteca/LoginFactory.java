package com.twu28.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LoginFactory {
    public LoginFactory(){

    }
    public ArrayList<Login> createLoginDetails(){
        ArrayList<Login> login= new ArrayList<Login>();
        Login login1= new Login("111-1111","juju");
        Login login2= new Login("111-1112","jiji");
        Login login3= new Login("111-1113","jojo");
        Login login4= new Login("111-1114","jeje");
        Login login5= new Login("111-1115","jaja");
        login.add(login1);
        login.add(login2);
        login.add(login3);
        login.add(login4);
        login.add(login5);
           return login;
    }
    public String loginAction(ArrayList<Login> logins, String userName, String password){

        for (Login login:logins ){
            if(login.userName.equals(userName)&&login.password.equals(password)){
                return"Login succesfull";
             //  break;
            }
            else   {
                return "invalid login";
            //    System.exit(0);
            }
        }

        return userName;
    }

    public String readUserName() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String uName = null;
       try {
            uName = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
                    }
        return uName;
    }
    public String readPassword() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = null;
        try {
            password = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
           }
        return password;
    }
}
