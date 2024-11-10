package main.com.incubyte;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		else {
			return Integer.parseInt(input);
		}
	} 
}
