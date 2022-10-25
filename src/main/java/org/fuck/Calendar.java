package org.fuck;

public class Calendar {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            else return year % 400 == 0;
        }
        return false;
    }
}
