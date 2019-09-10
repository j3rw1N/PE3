package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class genExceptionsTest {

    private GenExceptions genExceptions = new GenExceptions();

    @Test(expected = NegativeArraySizeException.class)
    public void throwNegativeArraySizeException() {
        genExceptions.throwNegativeArraySizeException();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsException() {
        genExceptions.throwIndexOutOfBoundsException();
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerException() {
        genExceptions.throwNullPointerException();
    }
}