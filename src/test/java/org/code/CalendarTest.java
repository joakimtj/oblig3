package org.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void testNotDivisibleBy4() {
        // 2007 is not divisible by 4.
        assertFalse(Calendar.isLeapYear(2007));
    }
    @Test
    void testDivisibleBy4ButNot100() {
        // 2004 is divisible by 4 but not 100.
        assertTrue(Calendar.isLeapYear(2004));
    }
    @Test
    void testDivisibleBy400() {
        // 2000 is divisible by 4, 100 and 400..
        assertTrue(Calendar.isLeapYear(205));
    }
    @Test
    void testDivisibleBy100ButNot400() {
        assertFalse(Calendar.isLeapYear(1900));
    }
}
