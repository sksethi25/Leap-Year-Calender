package org.leapyearcalendar;

import java.util.Scanner;

/**
 * Implements main function as entry point.
 */
public class LeapYearCalender {
    /**
     * Read user input integer year from console and print if its leap year or not
     *
     */
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a year to check if it is a leap year:");

            int yearInput = Math.abs(Integer.parseInt(scanner.nextLine()));
            LeapYear leapYear = new LeapYear();
            Boolean isLeapYear = leapYear.isLeapYear(yearInput);

            System.out.println("is Year " + yearInput + " a leap year: " + isLeapYear);
        }catch (NumberFormatException e){
            System.out.println("Entered value is not a valid year.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}