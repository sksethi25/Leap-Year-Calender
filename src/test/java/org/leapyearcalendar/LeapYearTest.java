package org.leapyearcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2000), "Year 2000 is a leap Year");
        assertFalse(leapYear.isLeapYear(1900), "Year 1900 is not a leap Year");
    }
}