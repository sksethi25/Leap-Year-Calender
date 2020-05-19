package org.leapyearcalendar;

public class LeapYearRuleSet {

    /**
     * Leap Year is mostly divisible by 4.
     * @param year Year to check
     * @return     boolean if year divisible by 4 or not
     */
    public boolean isDivisibleByFourRule(int year){
        return year % 4 == 0 ? true : false;
    }

    /**
     * An Year divisible by 4, not divisible by 100 is leap ,it its
     * divisible by  100 then it should be divisible by 400 to make it leap.
     * @param year
     * @return boolean if year is divisible by 100 & 400 true
     */
    public  boolean isDivisibleByHundredAndByFourHundredTooRule(int year){
         return year % 100 == 0 ? (year % 400 == 0 ? true :false ) : true;
    }
}