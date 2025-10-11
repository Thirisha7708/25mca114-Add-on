package Javaproblemsolving;

import java.util.Scanner;

public class StudentMarks {

	
		/**
		 * This program allows the user to enter 3 test marks of a student, 
		 calculates the total and average, and displays the result.
		 
		Problem Flow:
		Get 3 marks from user
		Add marks → total
		Divide total by 3.0 → average
		Display total and average
		
		Input / Output Example:
		Input:
		Enter Mark 1: 80  
		Enter Mark 2: 75  
		Enter Mark 3: 85  
		Output:
		Total Marks   = 240  
		Average Marks = 80.0
		 */
		
	public static void main(String[] args) {
		 
        Scanner sc= new Scanner(System.in);

		        
		        
		                                               // The Three Students Marks 
		        System.out.print("Enter Mark 1: ");
		        int mark1 = sc.nextInt();

		        System.out.print("Enter Mark 2: ");
		        int mark2 = sc.nextInt();

		        System.out.print("Enter Mark 3: ");
		        int mark3 = sc.nextInt();

		                                                // Calculate total
		        int total = mark1 + mark2 + mark3;

		                                                 // Divide total by 3.0 → average
		        double average = total / 3.0;

		       
		        System.out.println("Total Marks   = " + total);
		        System.out.println("Average Marks = " + average);

		        sc.close();
		    }
		

	}


