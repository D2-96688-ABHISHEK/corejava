package com.sunbeam.Q4;

enum Day {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Method to check weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    // Method to check weekday
    public boolean isWeekday() {
        return !isWeekend();
    }
}

public class Program {
    public static void main(String[] args) {

        Day today = Day.SATURDAY;

        System.out.println("Today: " + today);

        if (today.isWeekend())
            System.out.println("It is a Weekend");
        else
            System.out.println("It is a Weekday");
    }
}