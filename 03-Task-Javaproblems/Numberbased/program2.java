package Numberbased;

public class program2 {

	public static void main(String[] args) {
		int num = 4567; // Sample Input
        int count = 0;

        // Handle the case where the number is 0
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10; // Remove the last digit
                count++;        // Increment our tally
            }
        }

        System.out.println(count);

	}

}
