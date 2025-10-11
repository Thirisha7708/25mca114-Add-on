package Javaproblemsolving;


/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */

import java.util.Scanner;

		public class CompoundInterest {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter Principal (P): ");
		        double principal = scanner.nextDouble();

		        
		        System.out.print("Enter Rate of Interest (R): ");
		        double rate = scanner.nextDouble();

		        
		        System.out.print("Enter Time (T) in years: ");
		        double time = scanner.nextDouble();

		        
		        double amount = principal * Math.pow((1 + rate / 800), time);

		        
		        double compoundInterest = amount - principal;

		        
		        System.out.println("Compound Interest = " + compoundInterest);
		        System.out.println("Total Amount = " + amount);

		        scanner.close();
		    }
		


	}


