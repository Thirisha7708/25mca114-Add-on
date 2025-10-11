package patterns;

import java.util.Scanner;

public class Xshapetriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int rows=sc.nextInt();


for(int i=1; i<=rows; i++) { //i=rows; i>=1; i--
	for(int j = 1; j<=rows; j++) {
		if(j==i || j==rows-i+1) {
			
		System.out.print(i);
	}else {
	System.out.print(" ");
}
	}
	System.out.println();
}
sc.close();

	}

}


