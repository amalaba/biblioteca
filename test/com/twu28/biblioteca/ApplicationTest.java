package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;


public class ApplicationTest {
    @Test
    public void showWelcomeTest() {
        Assert.assertEquals("Welcome..", new Application().showWelcome());
    }


}
