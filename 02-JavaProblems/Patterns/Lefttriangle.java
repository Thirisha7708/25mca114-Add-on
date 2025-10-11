package patterns;

import java.util.Scanner;


public class Lefttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
			
			System.out.print("Enter number of rows: ");
			int n = sc.nextInt();

			
			for (int i = 1; i <= n; i++) {
			    // print stars
			    for (int j = 1; j <= i; j++) {
			        System.out.print("* ");
			    }
			    System.out.println();
			}
			sc.close();
		}
    }



