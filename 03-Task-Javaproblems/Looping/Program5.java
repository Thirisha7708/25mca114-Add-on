package Looping;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
				/*
				 * 5. Product of numbers from 1 to n (Factorial)
		   Sample Input: 5
		   Sample Output: 120
		*/
				Scanner in =  new Scanner(System.in);
				
				int n= 5;
				int c=1;
				for (int i=1; i<=n;i++) {
					
					c=c*i;
				}
		System.out.println(c);
		in.close();
			}

		}

	


