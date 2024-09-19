package com.itschool.library.unit_test;


import com.itschool.library.utils.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition_WithValidInput_ShouldPass() {
        //given
        int firstNum = 12;
        int secondNum = 13;
        int expectedResult = firstNum + secondNum;

        //when
        int actualResult = calculator.add(firstNum, secondNum);

        //then
        assertEquals(expectedResult, actualResult, "The addition result should be equal to the expected result");
    }

    @Test
    void testAddition_WithResultExceedsMaximumIntegerValue_ShouldFail() {
        int a =Integer.MAX_VALUE;
        int b = 1;
        long expectedResult =(long) a+ b;

        int actualResult = calculator.add(a,b);

        assertNotEquals(expectedResult, actualResult);
    }
}