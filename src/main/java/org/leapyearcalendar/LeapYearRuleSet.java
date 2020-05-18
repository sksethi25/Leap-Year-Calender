package org.leapyearcalendar;

public class LeapYearRuleSet {

    /**
     * @param year Year to check
     * @return     boolean if its divisble by 4 or not
     */
    public boolean isDivisibleByFourRule(int year){
        return year % 4 == 0 ? true : false;
    }
}
