package Arrays;

public class TwodimensionalArray {

	public static void main(String[] args) {
		int[][] num = {{25,35},{2,8},{47,49},
				{62,55}};
		
		//Access using index value
		System.out.println("\n Access using row and column index");
		System.out.println(num[0][0]);
		
		
		//Access all elements using for loop
		System.out.println("\n Access all elements using for loop");
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");//i==>row, j==>column
			}
			System.out.println();
		}
		
		//Access all elements using for each loop
		System.out.println("\n Access all elements using for each loop");
		for(int a[]: num) { //convert 2D to 1D format
			for(int b:a) {  //Get 1D array data as object and convert to variable
			System.out.print(b+" ");
		}
			System.out.println();

	}
	}
}
