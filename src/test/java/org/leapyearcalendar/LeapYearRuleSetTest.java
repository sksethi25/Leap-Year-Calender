package org.leapyearcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearRuleSetTest {

    @Test
    void isDivisibleByFourRule() {
        LeapYearRuleSet leapYearRuleSet = new LeapYearRuleSet();
        boolean actual = leapYearRuleSet.isDivisibleByFourRule(2000);
        assertTrue(actual, "Year 2000 is divisible by 4");
    }
}