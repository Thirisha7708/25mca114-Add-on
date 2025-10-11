package Javaproblemsolving;


	
	/**
	age>=18:
    Male:
        Room-5
    Female:
        Room-6
	Not Eligible
	 */
	
	import java.util.Scanner;
	public class VoteEligibility {
		public static void main(String []args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println( "Enter Your Age");
				int age= sc.nextInt();
				if(age>=18) {
					System.out.println("You are eligible for voting");
				}
				else {
					System.out.println("you are not eligible for voting");
				}
			}
	        

	        }

}
