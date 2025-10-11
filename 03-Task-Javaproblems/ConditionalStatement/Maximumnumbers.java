package ConditionalStatement;

import java.util.Scanner;

public class Maximumnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        System.out.print("Enter four numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        
	    int max=a;
		if(b>max) {
			max=b;
			
		}
		if(c>max) {
			max=d;
		}
		System.out.println("Maximum: "+ max);

	
	    sc.close();

	}
}
