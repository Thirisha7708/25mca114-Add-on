package Javaproblemsolving;


	
	/**
	 *  This program takes a string (text) and creates its reverse 
	 version in another string (reverseText). Each character from the 
	 original string is added in reverse order to the new string.
	 
	 Flow Summary
	Read the input string
	Loop from last character to first
	Use comma operator in loop (i--, j++)
	Add each character to reverseText
	Print the reversed output
	
	Sample I/O
	Input:
	Enter the string below:
	hello
	Output:
	Reversed Text: olleh

	 */
	
	
	import java.util.Scanner;

	public class StringReverse {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.println("Enter the string below:");
	        String text = sc.nextLine();

	        // Create a char array for reversed string
	        char[] reverseText = new char[text.length()];

	        // Loop with two counters: i goes backward, j goes forward
	        for (int i = text.length() - 1, j = 0; i >= 0; i--, j++) {
	            reverseText[j] = text.charAt(i);
	        }

	        // Convert char array to String
	        String reversed = new String(reverseText);

	        // Output
	        System.out.println("Reversed Text: " + reversed);

	        sc.close();
	    }
	}



