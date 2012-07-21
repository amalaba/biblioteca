package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 21/7/12
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckTest {
    @Test
    public void CheckLibNoTest(){                           //requirement 8
        Assert.assertEquals("Please contact the librarian",new Check().checkLibNo(123));
    }
}
