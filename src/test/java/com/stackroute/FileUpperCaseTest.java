package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileUpperCaseTest {

    private FileUpperCase fileUpperCase = new FileUpperCase();

    @Test
    public void testReadFile() {
        assertEquals("Error in reading uppercase1.txt","Class names should be nouns", fileUpperCase.readFile("upperCase1.txt"));
        assertEquals("Error in reading uppercase2.txt","in mixed case with the first letter of each internal word capitalized", fileUpperCase.readFile("upperCase1.txt"));

    }

    @Test
    public void testReadFileFailures() {
        assertNotNull("uppercase1.txt is not null", fileUpperCase.readFile("uppercase1.txt"));
        assertNotNull("uppercase2.txt is not null", fileUpperCase.readFile("uppercase2.txt"));

    }

    @Test
    public void testUpperCase() {
        assertEquals("Return capitalized content of upperCase1.txt", "CLASS NAMES SHOULD BE NOUNS", fileUpperCase.upperCase("upperCase1.txt"));
        assertEquals("Return capitalized content of upperCase2.txt", "IN MIXED CASE WITH THE FIRST LETTER OF EACH INTERNAL WORD CAPITALIZED", fileUpperCase.upperCase("upperCase2.txt"));
    }

    @Test
    public void testUpperCaseFailures() {
        assertNotNull("uppercase1.txt is not null", fileUpperCase.upperCase("uppercase1.txt"));
        assertNotNull("uppercase2.txt is not null", fileUpperCase.upperCase("uppercase2.txt"));

    }

}