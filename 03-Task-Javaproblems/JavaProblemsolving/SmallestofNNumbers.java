package Javaproblemsolving;

import java.util.Scanner;

public class SmallestofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This program first reads how many numbers the user wants to enter 
		 (N). Then it reads those N numbers and finds the smallest among 
		 them.
		 
		 Problem Flow:
		Get total number of inputs N
		Read first number as smallest
		Loop remaining N-1 times
		Compare each number with smallest
		Update smallest if a smaller number is found
		Print final smallest number
		
		Sample Input / Output:
		Input:
		Enter how many numbers you want to input: 5
		Enter number 1: 22
		Enter number 2: 18
		Enter number 3: 31
		Enter number 4: 6
		Enter number 5: 27
		Output:
		The smallest number is: 6

		 */
	





    
Scanner sc = new Scanner(System.in);


        // Input the count of numbers
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        // Read the first number as the initial minimum
        System.out.print("Enter number 1: ");
        int min = sc.nextInt();

        // Loop for remaining numbers
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }

        // Output the result
        System.out.println("The smallest number is: " + min);
        
        sc.close();
    }



}


	
		
		
		