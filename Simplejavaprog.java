package oops_practical;
import java.util.Scanner;
public class Simplejavaprog {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a message: ");
	    String message = sc.nextLine();

	    System.out.println("You entered: " + message);

	    sc.close();
	  }
	}


