package ConditionalStatement;
import java.util.Scanner;

public class Validtime {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter time (HH:MM): ");
		        String time = sc.next();

		        String[] parts = time.split(":");
		        int hour = Integer.parseInt(parts[0]);
		        int minute = Integer.parseInt(parts[1]);

		        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59)
		            System.out.println("Valid Time");
		        else
		            System.out.println("Invalid Time");
		        sc.close();
		    }
		  


		}
