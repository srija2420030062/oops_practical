package oops_practical;
import java.util.Scanner;
public class DemonstrateTypeCASting {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an integer value: ");
	    int i = sc.nextInt();

	    System.out.print("Enter a double value: ");
	    double d = sc.nextDouble();

	    byte b;

	    System.out.println("\nConversion of int to byte.");
	    b = (byte) i;
	    System.out.println("i and b: " + i + " " + b);

	    System.out.println("\nConversion of double to int.");
	    i = (int) d;
	    System.out.println("d and i: " + d + " " + i);

	    System.out.println("\nConversion of double to byte.");
	    b = (byte) d;
	    System.out.println("d and b: " + d + " " + b);

	    sc.close();
	  }
	}

