package org.leapyearcalendar;

import java.util.Scanner;

public class LeapYearCalender {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a year to check if it is a leap year:");

            int yearInput = Integer.parseInt(scanner.nextLine());
            LeapYear leapYear = new LeapYear();
            Boolean isLeapYear = leapYear.isLeapYear(yearInput);

            System.out.println("is Year " + yearInput + " a leap year: " + isLeapYear);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}