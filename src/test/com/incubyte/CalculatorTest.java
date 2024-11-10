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
	
	@Test
	public void shouldReturnSumOfMultipleNumbersDelimitedByComma() {
		assertEquals(6, Calculator.add("1,2,3"));
	}
	
	@Test
	public void shouldAcceptNewlineAsAValidDelimiter() {
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	
	@Test
	public void shouldAcceptCustomDelimiter() {
		assertEquals(11, Calculator.add("//;\n1;2;8"));
	}
	
	@Test
	public void shouldAcceptCustomDelimiterWithSpecialRegexChar1() {
		assertEquals(11, Calculator.add("//.\n1.2.8"));
	}
	
	@Test
	public void shouldAcceptCustomDelimiterWithSpecialRegexChar2() {
		assertEquals(11, Calculator.add("//$\n1$2$8"));
	}
}
