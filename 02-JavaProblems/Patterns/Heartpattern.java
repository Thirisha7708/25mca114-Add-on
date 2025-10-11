package patterns;

import java.util.Scanner;

public class Heartpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the rows:");
		int rows = sc.nextInt();
		
		for(int i = rows/2; i<=rows; i+=2) {
			for(int j = 1; j<rows-i; j+=2) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j<=rows-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = rows; i>=1; i--) {
			for(int j = i; j<rows; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("* ");
			}
			    System.out.println();
			}
		sc.close();
		}


	}


