package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(6, calculator.addition(1, 5));
	}

	@Test
	void subtraction() {
		assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	void divide() {
		assertEquals(2, calculator.divide(6, 3));
	}

    @Test
	void multiply() {
		assertEquals(18, calculator.multiply(6, 3));
	}
}