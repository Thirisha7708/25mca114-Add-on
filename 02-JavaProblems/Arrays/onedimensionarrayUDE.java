package Arrays;

import java.util.Scanner;

public class onedimensionarrayUDE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1D Array");
		int size= sc.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Element "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		/**
		 * Element 1:25
		 * arr[0]=25
		 * Element 2:39
		 * arr[1]=39
		 * Element 3:50
		 * arr[2]=50
		 * Element 4:73
		 * arr[3]=73
		 * Element 5:84
		 * arr[4]=84
		 */
		System.out.println("\n Enter the elements for 1D Array: ");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]+" ");
		}
		sc.close();


	}

}
