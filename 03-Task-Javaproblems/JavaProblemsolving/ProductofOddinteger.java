package Javaproblemsolving;

public class ProductofOddinteger {
	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */
	
	public class ProductOfOdds {
	    public static void main(String[] args) {
	        long product = 1; // use long to handle big result

	        // Loop through odd numbers from 1 to 15
	        for (int i = 1; i <= 15; i += 2) {
	            product *= i;
	        }

	        // Output
	        System.out.println("Product of odd numbers from 1 to 15 = " + product);
	    }
	}


}
