package Arrays;

import java.util.Arrays;

public class Arraymethods {

	public static void main(String[] args) {
		System.out.println("---Array Methods");
		System.out.println("\n 1. Filling Arrays");
        int[] arr = new int[5];
		
		System.out.println("\n Element before allocating value: "+Arrays.toString(arr));
		
		Arrays.fill(arr, 1);//fills the entire array with 1
		
		System.out.println("\n Array fill with single value: "+Arrays.toString(arr));
		
		Arrays.fill(arr, 1, 4, 2);//fills element from index 1 to 3 with 2
		
		System.out.println("\n Array fill with range: "+Arrays.toString(arr));
}
}
