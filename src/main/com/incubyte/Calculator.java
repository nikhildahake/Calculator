package main.com.incubyte;

import java.util.regex.Pattern;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	public static int add(String input) {
		if (input.isEmpty() || input == null) {
			return 0;
		}
		else if (input.startsWith("//")) {
			//Index 0 and 1 will be the two forward slashes
			int indexOfNewLine = input.indexOf("\n");
			String delimiter = input.substring(2, indexOfNewLine); 
			
			//Only consider the characters after the new line character
			input = input.substring(indexOfNewLine+1);
			
			int sum = splitTheStringAndSumNumbers(input, Pattern.quote(delimiter));
			
			return sum;
		}
		else if (input.contains(",")) {
			int sum = splitTheStringAndSumNumbers(input, ",|\n");
			return sum;
		}
		else {
			int number = Integer.parseInt(input); 
			if (number < 0) {
				throw new RuntimeException("Negative numbers are not allowed: " + input);
			}
			return number;
		}
	}
	
	private static int splitTheStringAndSumNumbers(String input, String delimiter) {
		String arr[] = input.split(delimiter);
		String listOfNegatives = getListOfNegatives(arr);
		
		if(!listOfNegatives.isEmpty()) {
			throw new RuntimeException("Negative numbers are not allowed: " + listOfNegatives);
		}
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			int number = Integer.parseInt(arr[i]); 
			sum += number;
		}
		return sum;
	}
	
	private static String getListOfNegatives(String arr[]) {
		String list = "";
		
		for (int i=0; i<arr.length; i++) {
			int number = Integer.parseInt(arr[i]); 
			if (number < 0) {
				list += number + ",";
			}
		}
		
		if (!list.isEmpty()) {
			//Remove last comma
			list = list.substring(0, list.length() - 1);
		}
		return list;
	}
}