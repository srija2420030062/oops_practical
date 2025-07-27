package oops_practical;
import java.util.Scanner;
public class PrimitiveData {


	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a character: ");
	    char a = sc.next().charAt(0);

	    System.out.print("Enter an integer: ");
	    int i = sc.nextInt();

	    System.out.print("Enter a byte value: ");
	    byte b = sc.nextByte();

	    System.out.print("Enter a short value: ");
	    short s = sc.nextShort();

	    System.out.print("Enter a float value: ");
	    float f = sc.nextFloat();

	    System.out.print("Enter a double value: ");
	    double d = sc.nextDouble();

	    System.out.print("Enter a long value: ");
	    long l = sc.nextLong();
	    System.out.println("char: " + a);
	    System.out.println("integer: " + i);
	    System.out.println("byte: " + b);
	    System.out.println("short: " + s);
	    System.out.println("float: " + f);
	    System.out.println("double: " + d);
	    System.out.println("long: " + l);

	    sc.close();
	  }
	}

