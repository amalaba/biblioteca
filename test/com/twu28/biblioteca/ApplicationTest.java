package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 1:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationTest {
      @Test
    public void showWelcomeTest(){                            //requirement 1
          Assert.assertEquals("Welcome..",new Application().showWelcome());
    }

    @Test
    public void CheckLibNoTest(){                           //requirement 8
        Assert.assertEquals("Please contact the librarian",new Application().checkLibNo(123));
    }
}
