package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {

    private DateOfWeek dateOfWeek = new DateOfWeek();

    @Test
    public void testFirstDay() {
        assertEquals("", "24/07/2017", dateOfWeek.firstDay("25/07/2017"));
    }

    @Test
    public void testFirstDayFailures() {
        assertNotNull("", dateOfWeek.firstDay("01/01/2019"));
    }

    @Test
    public void testLastDay() {
        assertEquals("", "30/07/2017", dateOfWeek.lastDay("26/07/2017"));
    }

    @Test

    public void testLastDayFailures() {
        assertNotNull("", dateOfWeek.lastDay("21/12/2019"));
    }

}