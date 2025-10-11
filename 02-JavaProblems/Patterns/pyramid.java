package patterns;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		        // ---- First Program: Pyramid ----
		        for (int i = 1; i <= n; i++) {
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // ---- Second Program: Inverted Pyramid ----
		        for (int i = n - 1; i >= 1; i--) {
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            // print stars
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        sc.close();
		    }
		


	}


