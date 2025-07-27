package oops_practical;
import java.util.Scanner;
public class RelOpe {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter value for a: ");
	    int a = sc.nextInt();

	    System.out.print("Enter value for b: ");
	    int b = sc.nextInt();

	    System.out.println("a is " + a + " and b is " + b);

	    System.out.println("a == b: " + (a == b));

	    System.out.println("a != b: " + (a != b));

	    System.out.println("a > b: " + (a > b));

	    System.out.println("a < b: " + (a < b));

	
	    System.out.println("a >= b: " + (a >= b));

	    System.out.println("a <= b: " + (a <= b));

	    sc.close();
	  }
	}
