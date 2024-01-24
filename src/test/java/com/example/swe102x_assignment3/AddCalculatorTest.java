package com.example.swe102x_assignment3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddCalculatorTest {
    @Test
    @DisplayName("Add method with 2 + 3")
    void addTestWithTwoAndThree() {
        var addCalculate = new AddCalculator();
        assertEquals(5, addCalculate.add(2, 3), "Expected result: 5");
    }
    @Test
    @DisplayName("Add method with zero handling")
    void addTestWithZeroAndThree() {
        var addCalculate = new AddCalculator();
        assertEquals(3, addCalculate.add(0, 3), "Expected result: 3");
    }
    @Test
    @DisplayName("Multiply method with 2 * 3")
    void multiplyTestWithTwoAndThree() {
        var multiplyCalculate = new AddCalculator();
        assertEquals(6, multiplyCalculate.multiply(2, 3), "Expected result: 6");
    }
    @Test
    @DisplayName("Multiply method with zero handling")
    void multiplyTestWithZeroAndThree() {
        var multiplyCalculate = new AddCalculator();
        assertEquals(0, multiplyCalculate.multiply(0, 3), "Expected result: 0");
    }
}