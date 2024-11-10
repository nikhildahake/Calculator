package test.com.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.com.incubyte.Calculator;

class CalculatorTest {

	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void shouldReturnNumberOnNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void shouldReturnSumOfTwoNumbersDelimitedByComma() {
		assertEquals(3, Calculator.add("1,2"));
	}
}
