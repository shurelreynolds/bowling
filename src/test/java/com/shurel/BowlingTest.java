package com.shurel;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    Bowling bowling;

    @Before
    public void setUp() {
        bowling=new Bowling();
    }

    @Test
    public void testGetScore() {
        assertEquals(0,bowling.getScore());
    }


}