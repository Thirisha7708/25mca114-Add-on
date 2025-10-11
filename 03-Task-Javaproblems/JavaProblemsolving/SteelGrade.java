package Javaproblemsolving;


	
	/**
	A certain grade of steel is graded according to the following conditions:

	1. "Hardness must" be greater than 50.
	2. "Carbon content" must be less than 0.7
	3. "Tensile strength" must be greater than 5600

	The grades are as follows:
	Grade is 10, if all three conditions are met.
	Grade is 9, if conditions 1 and 2 are met.
	Grade is 8, if conditions 2 and 3 are met.
	Grade is 7, if conditions 1 and 3 are met.
	Grade is 6, if only one condition is met.
	Grade is 5, if none of the conditions are met.
		 */
	
	import java.util.Scanner;

	public class SteelGrade {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter hardness: ");
	        int hardness = sc.nextInt();

	        System.out.print("Enter carbon content: ");
	        double carbon = sc.nextDouble();

	        System.out.print("Enter tensile strength: ");
	        int tensile = sc.nextInt();

	        // Conditions
	        boolean cond1 = hardness > 50;
	        boolean cond2 = carbon < 0.7;
	        boolean cond3 = tensile > 5600;

	        int grade;

	        if (cond1 && cond2 && cond3) {
	            grade = 10;
	        } else if (cond1 && cond2) {
	            grade = 9;
	        } else if (cond2 && cond3) {
	            grade = 8;
	        } else if (cond1 && cond3) {
	            grade = 7;
	        } else if (cond1 || cond2 || cond3) {
	            grade = 6;
	        } else {
	            grade = 5;
	        }

	        // Output
	        System.out.println("The grade of the steel is: " + grade);

	        sc.close();
	    }
	}



