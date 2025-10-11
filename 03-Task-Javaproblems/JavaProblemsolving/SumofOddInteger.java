package Javaproblemsolving;

import java.util.Scanner;

public class SumofOddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This program calculates the sum of the first n odd integers 
		 (Example: 1 + 3 + 5 + ... + (2n - 1)).
		 
		 Problem Flow:
		Input n from user
		Loop from 1 to (2n−1) in steps of 2
		Accumulate the sum
		Print the result
		
		Input / Output Example:
		Input:
		Enter how many odd numbers to sum: 5
		Output:
		Sum of first 5 odd numbers is 25
		(1 + 3 + 5 + 7 + 9 = 25)

		 */
		
		
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter how many odd numbers to sum: ");
	        int n = sc.nextInt();

	        int sum = 0; 
	        int number = 1; // One odd number

	        // Loop for first n odd numbers
	        for (int i = 1; i <= n; i++) {
	            sum += number;
	            number += 2; // Move to next odd number
	        }
	//Display 
	        System.out.println("Sum of first " + n + " odd numbers is " + sum);

	        sc.close();
	    
	
	}

}
