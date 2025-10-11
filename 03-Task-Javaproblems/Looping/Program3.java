package Looping;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
				/*
				 * 3. Multiplication Table of a number
		   Sample Input: 5
		   Sample Output: 5 10 15 20 25 30 35 40 45 50
		*/
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the Values:");
				
				int a=5;
				
				for (int i=1;i<=10;i++) {
					System.out.println( i*a);
					
				}
				in.close();

			}

		

	}


