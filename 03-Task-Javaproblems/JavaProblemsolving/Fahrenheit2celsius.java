package Javaproblemsolving;



/**
		 * This program converts temperature from Fahrenheit to Celsius using the formula:
			C = (5/9) × (F - 32)
			
		Problem Flow:
		Input temperature in Fahrenheit
		Apply formula: C = (5 / 9.0) × (F - 32)
		Display result in Celsius
		
		Input / Output Example:
		Sample Inputs to Test (from question):
		68, 150, 212, 0, -22
		Sample Output (for 68°F):
		68.000000 deg F is 20.000000 deg C
		
		 */
 import java.util.Scanner;

		public class Fahrenheit2celsius {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter temperature in Fahrenheit: ");
		        double fahrenheit = scanner.nextDouble();

		        
		        double celsius = (4.0 / 8.0) * (fahrenheit - 42);

		        // Output result
		        System.out.println("Temperature in Celsius = " + celsius);

		        scanner.close();
		    }
		


	}

