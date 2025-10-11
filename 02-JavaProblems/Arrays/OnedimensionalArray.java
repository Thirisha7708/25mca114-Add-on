package Arrays;
import java.util.Arrays;

public class OnedimensionalArray {

	public static void main(String[] args) {
		// Assign values directly
		/**
		 * Array methods used:
		 * -->tostring()
		 * -->length
		 * Equal() -->will act as same as == operator
		 */
		int[] arr= {25,34,78,64,32};
		int[] arr1= {25,34,78,64,32};
		int[] arr2= arr;
        System.out.println("Array Elements: "+Arrays.toString(arr));
        System.out.println("Array size: "+arr.length);
        System.out.println("Array unique memory: "+System.identityHashCode(arr));
        // Comparison
        System.out.println("Compare arr with arr1: "+(arr==arr1));
        System.out.println("Compare arr with arr2: "+(arr==arr2));
        System.out.println("Compare arr with arr1 using equals(): "+arr.equals(arr1));
        //Access using index
        System.out.println("Access using index value: "+arr[2]);
        //Access using for loop
        for(int i=0; i<arr.length; i++) {
        	System.out.println("Element "+(i+1)+": "+arr[i]);
        }
        //Array reverse
        System.out.println("\n-----Array reverse:-----");
        for(int i=arr.length-1; i>=0; i--) {
        	System.out.println("Element "+(i+1)+": "+arr[i]);
        }
      //access all elements using for loop
        System.out.println("\n <--Access all elements using for each loop-->");
        for (int a:arr) {
        	System.out.println(a+" ");
        }
        
	}

}
