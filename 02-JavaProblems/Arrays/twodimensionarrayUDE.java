package Arrays;

import java.util.Scanner;

public class twodimensionarrayUDE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the rowsize for 2D Array: ");
		int rowsize = sc.nextInt();
		
		 System.out.println("Enter the colsize for 2D Array: ");
		 int colsize = sc.nextInt();
		
		int[][] arr= new int[rowsize][colsize];
		
		System.out.println("Enter the elements for 2D Array: ");
		
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
				System.out.print("Element ["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n 2D Array Elements: ");
		for(int i=0; i<rowsize; i++) {
			for(int j=0; j<colsize; j++) {
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
        sc.close();

	}

	}
}
