package patterns;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int rows=sc.nextInt();


for(int i=1; i<=rows; i++) { //i=rows; i>=1; i--
	for(int j = 1; j<=rows; j++) {
		System.out.print("* ");
	}
	System.out.println();
}
sc.close();

	}

}
