package Looping;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
	
                 /*
				 * 6. Sum of factorial of n numbers
		   Sample Input: n = 3, Numbers: 2 3 4
		   Sample Output: 2! + 3! + 4! = 2 + 6 + 24 = 32
		*/
				Scanner sc = new Scanner (System.in);
				
				
				        System.out.print("Enter the numbers: ");
				        int n = sc.nextInt();

				        int sum = 0;
				        System.out.println("Enter " + n + " numbers:");
				        for (int i = 0; i < n; i++) {
				            int num = sc.nextInt();
				            int fact = 1;
				            for (int j = 1; j <= num; j++) {
				                fact *= j;
				            }
				            sum += fact;
				        }
				        System.out.println("Sum of factorials = " + sum);
				        sc.close();
				    }
				}

	
