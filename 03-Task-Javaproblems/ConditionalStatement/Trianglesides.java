package ConditionalStatement;
import java.util.Scanner;

public class Trianglesides {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        // Input three sides
		        System.out.print("Enter three sides of a triangle: ");
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        
		        // Check triangle condition
		        if ((a + b > c) && (a + c > b) && (b + c > a)) {
		            System.out.println("Triangle is possible");
		        } else {
		            System.out.println("Triangle is not possible");
		        }
		        
		        sc.close();
		    }
		


	}


