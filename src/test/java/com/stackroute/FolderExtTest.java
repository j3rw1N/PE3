package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FolderExtTest {

    private FolderExt folderExt = new FolderExt();

    @Test
    public void testGetAllFiles() {
        List<String> files = new ArrayList<>();
        files.add("ext.csv");
        files.add("upperCase1.txt");
        files.add("upperCase2.txt");
        files.add("freq.txt");
        assertEquals("Return all filesNames in the resources folder", files, folderExt.getAllFiles());
    }

    @Test
    public void testGetAllFilesFailures() {
        assertNotNull("Return all filesNames", folderExt.getAllFiles());
    }

    @Test
    public void testReadExt() {
        String contents = "a,b,c";
        assertEquals("Return contents of csv file as string", contents, folderExt.readExt(".csv"));
    }

    @Test
    public void testReadExtFailures() {
        assertNotNull("The file is not empty, return the contents of the file", folderExt.readExt(".csv"));
    }
}