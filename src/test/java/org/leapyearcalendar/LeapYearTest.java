package org.leapyearcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class that Implements various functions to test LeapYear class
 */
class LeapYearTest {

    /**
     * Test to check proper functioning of isLeapYear function.
     */
    @Test
    void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2004), "Year 2004 is a leap Year");
        assertTrue(leapYear.isLeapYear(-2008), "Year 2008 is a leap Year");
        assertTrue(leapYear.isLeapYear(0), "Year 0 is a leap Year");
        assertFalse(leapYear.isLeapYear(1900), "Year 1900 is not a leap Year");
        assertTrue(leapYear.isLeapYear(2000), "Year 2000 is a leap Year");
    }
}