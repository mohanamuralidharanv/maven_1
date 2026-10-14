package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NumberReverserTest {
    @Test
    void reversesPositiveNumber() {
        assertEquals(54321, NumberReverser.reverse(12345));
    }

    @Test
    void preservesNegativeSign() {
        assertEquals(-987, NumberReverser.reverse(-789));
    }

    @Test
    void dropsTrailingZeros() {
        assertEquals(321, NumberReverser.reverse(12300));
    }

    @Test
    void reversesZero() {
        assertEquals(0, NumberReverser.reverse(0));
    }

    @Test
    void reportsOverflow() {
        assertThrows(ArithmeticException.class, () -> NumberReverser.reverse(1_534_236_469));
    }
}
