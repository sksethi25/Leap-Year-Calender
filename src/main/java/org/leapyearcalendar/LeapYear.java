package org.leapyearcalendar;

public class LeapYear {

    public boolean isLeapYear(int year){
        LeapYearRuleSet leapYearRuleSet = new LeapYearRuleSet();
        Boolean isleapYear = leapYearRuleSet.isDivisibleByFourRule(year);
        return  isleapYear;
    }
}
