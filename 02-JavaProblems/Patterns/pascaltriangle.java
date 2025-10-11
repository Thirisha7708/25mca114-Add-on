package patterns;

import java.util.Scanner;

public class pascaltriangle {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in) ;
				
				System.out.print("Enter the number of rows: ");
				int rows = sc.nextInt();

				
				for (int i = 0; i < rows; i++) {
					int number = 1;
				    // print stars
				    for (int j = 0; j < rows-i; j++) {
				        System.out.print(" ");
				    }
				 for (int k=0; k<=i; k++) {
				    System.out.print(number+" ");
				    number=number*(i-k)/(k+1);
				}
				 System.out.println();
			}
				sc.close();
	    }
}


