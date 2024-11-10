package main.com.incubyte;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		else if (input.contains(",")) {
			String arr[] = input.split(",");
			int sum = 0;
			
			for (int i=0; i<arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			return sum;
		}
		else {
			return Integer.parseInt(input);
		}
	} 
}
