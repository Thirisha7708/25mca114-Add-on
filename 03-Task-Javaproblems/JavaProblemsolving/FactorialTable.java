package Javaproblemsolving;

import java.util.Scanner;

/** * This program reads a number n from the user and prints the
 *  factorial of numbers from 1 to n in a table format. 
 *  Problem Flow: Read n from user Start fact = 1 Loop from 1 to n
 *   Multiply fact *= i Print each number with its factorial 
 *   Sample Output: Input: Enter the N value: 5 
 * Output: N | Factorial -------------------- 1 | 1 2 | 2 3 | 6 4 | 24 5 | 120 */


public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		

		
		    
        Scanner sc = new Scanner(System.in);


		        // Input
		        System.out.print("Enter the N value: ");
		        int n = sc.nextInt();

		        // Print table header
		        System.out.println("\nN   |   Factorial");
		        System.out.println("--------------------");

		        long fact = 1;  // factorial grows very fast, so use long

		        // Loop to calculate and print factorials
		        for (int i = 1; i <= n; i++) {
		            fact *= i;
		            System.out.printf("%-3d | %12d%n", i, fact);
		        }

		        sc.close();
		    
		


	}

}
