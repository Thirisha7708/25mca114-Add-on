package ConditionalStatement;
import java.util.Scanner;


public class Validated {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter date (dd/mm/yyyy): ");
	        String date = sc.next();

	        String[] d = date.split("/");

	        int day = Integer.parseInt(d[0]);
	        int month = Integer.parseInt(d[1]);
	        int year = Integer.parseInt(d[2]);

	        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	        int days = 0;

	        if (month == 1 || month == 3 || month == 5 || month == 7 || 
	            month == 8 || month == 10 || month == 12)
	            days = 31;
	        else if (month == 4 || month == 6 || month == 9 || month == 11)
	            days = 30;
	        else if (month == 2)
	            days = leap ? 29 : 28;

	        if (month >= 1 && month <= 12 && day >= 1 && day <= days)
	            System.out.println("Valid Date");
	        else
	            System.out.println("Invalid Date");
	    sc.close();
	    }
	  
	}
