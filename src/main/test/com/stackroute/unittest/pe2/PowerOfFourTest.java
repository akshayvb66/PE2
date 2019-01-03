package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour q2;
    @Before
    public void setUp() throws Exception {
        q2=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ispower4() {
        assertEquals(false,q2.ispower4(3));
    }
}