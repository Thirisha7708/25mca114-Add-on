package Javaproblemsolving;


	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */
	
	import java.util.Scanner;

	public class TextAnalysis {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.println("Enter the text below:");
	        String text = sc.nextLine();

	        // Counters
	        int letters = 0, digits = 0, spaces = 0, others = 0;

	        // Analyze each character
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else if (Character.isWhitespace(ch)) {
	                spaces++;
	            } else {
	                others++;
	            }
	        }

	        // Output results
	        System.out.println("Letters : " + letters);
	        System.out.println("Digits : " + digits);
	        System.out.println("Space Chars : " + spaces);
	        System.out.println("Others : " + others);

	        sc.close();
	    }
	}



