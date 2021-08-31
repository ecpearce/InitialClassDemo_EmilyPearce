package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2004IsLeapYear() {
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2004);
        Assertions.assertTrue(result);
    }
}
