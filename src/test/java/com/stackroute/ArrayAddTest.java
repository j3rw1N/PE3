package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAddTest {

    private ArrayAdd arrayAdd = new ArrayAdd();

    @Test
    public void testAdd() {
        int row = 3;
        int col = 2;
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{9, 8, 7, 6, 5, 4};
        int[] exp = new int[]{10, 10, 10, 10, 10, 10};
        assertArrayEquals("wrong op", exp, arrayAdd.add(row, col, arr1, arr2));
    }

    @Test
    public void testAddFailures() {
        int row = 3;
        int col = 2;
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{9, 8, 7, 6, 5, 4};
        assertNull("Can't add array of two diff size", arrayAdd.add(row, col, arr1, arr2));
    }
}