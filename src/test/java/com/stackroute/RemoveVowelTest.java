package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {

    private RemoveVowel removeVowel = new RemoveVowel();

    @Test
    public void testRemove() {
        String[] inp = {"India", "United States"};
        String[] exp = {"Ind", "Untd Stts"};
        assertArrayEquals("remove lowercase vowels", exp, removeVowel.remove(inp));
        inp = new String[]{"Germany", "Egypt"};
        exp = new String[]{"Grmny", "Egypt"};
        assertArrayEquals("remove lowercase vowels", exp, removeVowel.remove(inp));
    }

    @Test
    public void testRemoveFailures() {
        String[] inp = {"czechoslovakia"};
        assertNotNull("Shouldn't be null", removeVowel.remove(inp));
    }

}