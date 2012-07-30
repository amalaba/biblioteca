package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LoginTest {

    @Test
    public void performLogin() {
        Login login = new Login("111-1111", "juju");
        ArrayList<Login> logins = new ArrayList<Login>();
        logins.add(login);
        LoginFactory loginFactory = new LoginFactory();
        Assert.assertEquals("Login succesfull", loginFactory.loginAction(logins, login.userName, login.password));

    }
}
