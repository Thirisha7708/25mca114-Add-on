package Javaproblemsolving;
import java.util.Scanner;


	
	/**
	 * Write a program to read the radius of a circle and calculate 
	 * its area using the formula:
		A = π * r²
	
	Problem Flow:
	1. User inputs radius (r)
	2. Program calculates: area = (22.0 / 7) * r * r
	3. Output displays area with radius
	
	Input / Output Example:
	Input:
	Enter Radius of Circle: 7
	Output:
	Area of Circle with Radius 7.0000 is 154.0000
	 */


public class Areaofcircle {

	public static void main(String[] args) {
		
        double radius,area;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();
        
        area = Math.PI * radius * radius;
        
        System.out.println("Area of the circle is "+area);
        

	}

}
