package Javaproblemsolving;

import java.util.Scanner;

public class SimpleStringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This program reads a five-letter word from the user and encodes 
		 it by subtracting 1 from the ASCII value of each character. 
		 It then prints the newly encoded word.
		 
		 Problem Flow:
		Get 5-letter word input
		Loop each character → subtract 1 from ASCII
		Build new string with changed characters
		Print encoded result
		
		Input / Output Example:
		Input:
		Enter a Five letter word: white
		Output:
		Encoded Word: vghsd
		 */
		
		 
        Scanner sc = new Scanner(System.in);


		        
		        System.out.print("Enter a Five letter word: ");
		        String word = sc.nextLine();// String Word Using

		        // Get 5-letter word input
		        if (word.length() != 5) {
		            System.out.println("Please enter exactly five letters!");
		        } else {
//		            String encoded = "";

		            // Encoding: subtract 1 from ASCII value of each character
//		            for (int i = 0; i < word.length(); i++) {
//		                char ch = word.charAt(i);
//		                ch = (char) (ch - 1); // subtract 1 from ASCII
//		                encoded += ch;
//		            }

		            // Output: Encoded word
//		            System.out.println("Encoded Word: " + encoded);
		        }

		        sc.close();
		    }
		

	}


