package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FactorialTest {

    Factorial test;

    @Before
    public void setUp() throws Exception {

        test=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void factorial() {
        assertEquals(24,test.factorial(4));
    }

    @Test
    public void factorialFailure() {
        assertNotEquals(23,test.factorial(4));

    }
}
