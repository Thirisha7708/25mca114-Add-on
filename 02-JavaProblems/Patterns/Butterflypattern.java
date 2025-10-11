package patterns;

import java.util.Scanner;

public class Butterflypattern {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of the rows:");
			
			int rows = sc.nextInt();
			//upper half
			for(int i=1;i<=rows;i++) {
				//left star
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				//Middle space
				for(int j=1;j<=2*(rows-i); j++) {
					System.out.print("  ");
				}
				//Right star
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			//lower half
			for(int i=rows-1;i>=1;i--) {
				//left star
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				//Middle space
				for(int j=1;j<=2*(rows-i); j++) {
					System.out.print("  ");
				}
				//Right star
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			sc.close();

	}
}