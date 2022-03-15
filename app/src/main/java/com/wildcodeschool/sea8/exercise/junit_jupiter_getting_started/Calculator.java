package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

    /* public int minus(int a, int b) {
		return a + b;  // ERROR!!!
	} */

    public int minus(int a, int b) {
		return a - b;
	} 

	public int divide(int a, int b) {
		return a / b;
	}

    /* public int divide(int a, int b) {
		return a * b; // ERROR!!!
	} */

	public int multiply(int a, int b) {
		return a * b;
	}
}