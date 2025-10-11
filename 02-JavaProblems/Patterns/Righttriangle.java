package patterns;

import java.util.Scanner;



public class Righttriangle {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter number of rows: ");
			int n = sc.nextInt();

			// Print right angle triangle
			for (int i = 1; i <= n; i++) {
			    // print spaces first
			    for (int j = 1; j <= n - i; j++) {
			        System.out.print("  "); // two spaces for alignment
			    }
			    // print stars
			    for (int j = 1; j <= i; j++) {
			        System.out.print("* ");
			    }
			    System.out.println();
			}
			sc.close();
		}
    }



