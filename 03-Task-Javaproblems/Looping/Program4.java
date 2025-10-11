package Looping;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
				/*
				 * 4. Sum of numbers from 1 to n
		   Sample Input: 5
		   Sample Output: 15
		*/
				Scanner in = new Scanner(System.in);
				
				int n= 5;
				int c=0;
				for (int i=1; i<=n;i++) {
					
					c=c+i;
					
				}
				System.out.println(c);
		in.close();
			}

		

	}


