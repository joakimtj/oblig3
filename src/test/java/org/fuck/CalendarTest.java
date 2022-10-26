package org.fuck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarTest {

    @Test
    void notDivisibleBy4Test() {
        // 2007 is not divisible by 4.
        Assertions.assertFalse(Calendar.isLeapYear(2007));
    }
    @Test
    void divisibleBy4ButNot100Test() {
        // 2004 is divisible by 4 but not 100.
        Assertions.assertTrue(Calendar.isLeapYear(2004));
    }
    @Test
    public void divisibleBy400Test() {
        // 2000 is divisible by 4, 100 and 400..
        Assertions.assertTrue(Calendar.isLeapYear(2000));
    }
    @Test
    void divisibleBy100ButNot400Test() {
        Assertions.assertFalse(Calendar.isLeapYear(1900));
    }
}
