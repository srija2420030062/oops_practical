package oops_practical;
import java.util.Scanner;
public class TernaryOpe {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter number of days in February: ");
	    int februaryDays = sc.nextInt();
	    String result;

	    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(result);

	    sc.close();
	  }
	}
