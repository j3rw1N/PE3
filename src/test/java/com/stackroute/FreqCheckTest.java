package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class FreqCheckTest {
    private FreqCheck freqCheck = new FreqCheck();

    @Test
    public void testCheck() {
        String[] expected = {"3 i",
                "2 a",
                "1 to",
                "1 sleep",
                "1 man",
                "1 like",
                "1 home",
                "1 have",
                "1 am"};
        assertArrayEquals("Count the frequency of words", expected, freqCheck.check());
    }

    @Test
    public void testCheckFailures() {
        assertNotNull("given file is not empty", freqCheck.check());
    }
}