package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class checkNumTest {

    private CheckNum checkNum = new CheckNum();

    @Test
    public void testIsConsecutive() {
        String  inp = "98,96,95,94,93";
        assertFalse("98,96,95,94,93 are not consecutive", checkNum.isConsecutive(inp));
        inp = "54,53,52,51,50,49,48";
        assertTrue("54,53,52,51,50,49,48 are consecutive",checkNum.isConsecutive(inp));
        inp = "1,2,3,4,5,6,6";
        assertFalse("1,2,3,4,5,6,6 are not consecutive", checkNum.isConsecutive(inp));
    }
}