package Looping;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
				/*
				 * 2. Print all odd and even numbers up to n
		   Sample Input: 10
		   Sample Output: Odd: 1 3 5 7 9, Even: 2 4 6 8 10

		*/
				Scanner in = new Scanner(System.in);
				
				int a =10;
				System.out.print("odd:");
				for (int i=1;i<=a;i++) 
				{
					if(i%2!=0)
					{
						
						System.out.print(i+"\t");
					
				}}
				System.out.print(",even:");
				for(int i=1;i<=a;i++)
				{
					if(i%2==0)
					{
						System.out.print(i+"\t");
					}
				}
				in.close();
				
			}

		}

	


