package Javaproblemsolving;

import java.util.Scanner;

public class AreaVolumeSphere {

	
		

		
		
			
			/**
			 *  This program calculates the Volume and Surface Area of a sphere 
			 *  using the following formulas:
					Volume (V) = (4/3) × π × r³
					Area (A) = 4 × π × r²
			
			Problem Flow:
			Get r (radius) from user
			Calculate area using A = 4πr²
			Calculate volume using V = (4/3)πr³
			Display both values
			
			 Input / Output Example:
			Input:
			Enter Radius of Sphere: 7
			Output:
			Volume of Sphere: 1436.571429
			Area of Sphere  : 615.428571
			
			 */

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);


		        System.out.print("Enter Radius of Sphere: ");
		        double r = sc.nextDouble();

		        double area = 4 * Math.PI * r * r;                   //(Reference to Problem Flow)
		        // Calculate the  Area and Volume Values             //  A = 4πr²
		        double volume = (4.0 / 3.0) * Math.PI * r * r * r;   // V = (4/3)πr³

		        System.out.println("Volume of Sphere: " + volume);
		        System.out.println("Area of Sphere  : " + area);

		        sc.close();
		    }
		
	}


