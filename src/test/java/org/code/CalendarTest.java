package org.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarTest {

    @Test
    void testNotDivisibleBy4() {
        // 2007 is not divisible by 4.
        Assertions.assertFalse(Calendar.isLeapYear(2007));
    }
    @Test
    void testDivisibleBy4ButNot100() {
        // 2004 is divisible by 4 but not 100.
        Assertions.assertTrue(Calendar.isLeapYear(2004));
    }
    @Test
    public void testDivisibleBy400() {
        // 2000 is divisible by 4, 100 and 400..s
        Assertions.assertTrue(Calendar.isLeapYear(2000));
    }
    @Test
    void testDivisibleBy100ButNot400() {
        Assertions.assertFalse(Calendar.isLeapYear(1900));
    }
}
