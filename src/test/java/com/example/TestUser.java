package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUser {

    private DB db;

    @Before
    public void newDB(){
        db = new DB();
    }

    @Test
    public void checkUser(){
        int expected = db.user().size();
        Assert.assertEquals(expected, 4);
    }

    @Test
    public void checkUr(){
        int expected = db.ur().size();
        Assert.assertEquals(expected, 4);
    }

    @Test
    public void checkFiz(){
        int expected = db.fiz().size();
        Assert.assertEquals(expected, 4);
    }

    @Test
    public void equalityFizUr(){
        int expectedFiz = db.fiz().size();
        int expectedUr = db.ur().size();
        Assert.assertTrue(expectedFiz > expectedUr);
    }

    @Test
    public void nullUser(){
        int expected = db.user().size();
        Assert.assertNull(expected);
    }
}