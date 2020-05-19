package org.leapyearcalendar;

/**
 * Implements various functions related to leap year.
 */
public class LeapYear {

    /**
     * This function executes various rule sets and check if its pass them.
     * @param year
     * @return  if it is a leap year or not according to rule set.
     */
    public boolean isLeapYear(int year){
        LeapYearRuleSet leapYearRuleSet = new LeapYearRuleSet();
        return leapYearRuleSet.isDivisibleByFourRule(year) &&
                leapYearRuleSet.isDivisibleByHundredAndByFourHundredTooRule(year);
    }

}
