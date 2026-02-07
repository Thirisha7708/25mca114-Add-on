package Numberbased;

public class program3 {
	public static void main(String[] args) {
		int num = 234; // Sample Input
        int sum = 0;

        // Make the number positive to handle negative inputs
        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10; // Extract last digit (e.g., 4)
            sum += digit;         // Add it to the total sum
            num = num / 10;      // Remove the last digit
        }

        System.out.println(sum);

	}
}
