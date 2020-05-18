package org.leapyearcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean actual = leapYear.isLeapYear(2000);
        assertTrue(actual, "Year 2000 is a leap Year");
    }
}