package Operators;
import java.util.Scanner;
public class Ternaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		        System.out.print("Enter up to four integers: ");
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        int d = sc.nextInt();
		        int max_temp1=(a>b) ? a : b;
		        int max_temp2=(c>d) ? c:d;
		        int max4=(max_temp1>max_temp2) ? max_temp1: max_temp2;
		        System.out.println("Maximum: " + max4);
		        sc.close();
	}
}

		        


