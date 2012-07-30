package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27/7/12
 * Time: 12:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void shouldDisplayMovieDetails() {
        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", "gfgdfg", 9.2);
        Movie theGodfather = new Movie("The Godfather", "gfgdfg", 9.0);
        Assert.assertEquals("The Shawshank Redemption" + " " + "gfgdfg" + " " + 9.2, theShawshankRedemption.showMovieDetails());
        Assert.assertEquals("The Godfather" + " " + "gfgdfg" + " " + 9.0, theGodfather.showMovieDetails());

    }
}
