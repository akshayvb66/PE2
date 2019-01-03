package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    Reverse q1;
    @Before
    public void setUp() throws Exception {
        q1=new Reverse();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void reverse() {

        assertEquals("cba",q1.reverse("abc"));

    }

    @Test
    public void ispallindrome() {

        assertEquals(true,q1.ispallindrome("racecar"));
    }
}