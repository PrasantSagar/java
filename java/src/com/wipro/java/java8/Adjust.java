package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        
        // Get the current time
        LocalTime now = LocalTime.now();
        
        // Get the first day of next month using TemporalAdjusters
        LocalDate firstDayNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        
        // Get the next Saturday
        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        
        // Print the current date, time, first day of next month, and next Saturday
        System.out.println("Today's Date: " + today);
        System.out.println("Current Time: " + now);
        System.out.println("First Day of Next Month: " + firstDayNextMonth);
        System.out.println("Next Saturday: " + nextSaturday);
    }
}

