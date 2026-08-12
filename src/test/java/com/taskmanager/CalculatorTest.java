package com.taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void add_shouldReturnSum_of_twoNumbers(){
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5, result);
    }
}
