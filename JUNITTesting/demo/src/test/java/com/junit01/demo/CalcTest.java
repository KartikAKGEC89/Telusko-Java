package com.junit01.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    public static void show() {
        Calc obj = new Calc();
        int result = obj.divide(10, 5);
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }
}
