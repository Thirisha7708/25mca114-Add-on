package Numberbased;

public class program1 {
	public static void main(String[] args) {
		int num = 1234; // Sample Input
		        
		        // Handle the case if the number is 0
		        if (num == 0) {
		            System.out.print(0);
		        }

		        while (num > 0) {
		            int digit = num % 10;      // Get the last digit
		            System.out.print(digit + " "); // Print it
		            num = num / 10;            // Remove the last digit
		        }

			}

		}


