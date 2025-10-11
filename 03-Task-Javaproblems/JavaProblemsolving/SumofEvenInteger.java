package Javaproblemsolving;

public class SumofEvenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This program finds the sum of even numbers between 2 and 30 (inclusive).
		 	
		 Problem Flow:
		Start loop from 2 to 30
		Check if number is even (i % 2 == 0)
		Add to sum
		Print final sum
		
		 Input / Output Example:
		Output:
		Sum of even numbers from 2 to 30 = 240
		(Even numbers: 2 + 4 + 6 + ... + 30 = 240)
		 */
		
		
	    	// Scanner = new Scanner(System.in);
	        int sum = 0;

	        // Start loop from 2 to 30
	        for (int i = 2; i <= 30; i++) {
	        	//Check if number is even (i % 2 == 0)
	            if (i % 2 == 0) {  
	            	//Add to sum
	                sum += i;
	            }
	        }

	        
	        System.out.println("Sum of even numbers from 2 to 30 = " + sum);
	    }
	

	}


