package org.leapyearcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class that Implements various functions to test LeapYearRuleSet class
 */
class LeapYearRuleSetTest {

    /**
     * Test to check proper functioning of isDivisibleByFourRule function.
     */
    @Test
    void isDivisibleByFourRule() {
        LeapYearRuleSet leapYearRuleSet = new LeapYearRuleSet();
        boolean actual = leapYearRuleSet.isDivisibleByFourRule(2000);
        assertTrue(actual, "Year 2000 is divisible by 4");
    }

    /**
     * Test to check proper functioning of isDivisibleByHundredAndByFourHundredTooRule function.
     */
    @Test
    void isDivisibleByHundredAndByFourHundredTooRule() {
        LeapYearRuleSet leapYearRuleSet = new LeapYearRuleSet();
        boolean actualCase1 = leapYearRuleSet.isDivisibleByHundredAndByFourHundredTooRule(2008);
        assertTrue(actualCase1, "Year 2008 is not divisible by 100");

        boolean actualCase2 = leapYearRuleSet.isDivisibleByHundredAndByFourHundredTooRule(1800);
        assertFalse(actualCase2, "Year 1800 is divisible by 100 but not by 400");

        boolean actualCase3 = leapYearRuleSet.isDivisibleByHundredAndByFourHundredTooRule(2000);
        assertTrue(actualCase3, "Year 2000 is divisible by 100 and by 400 too");
    }
}