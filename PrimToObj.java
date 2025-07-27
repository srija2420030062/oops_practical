package oops_practical;
import java.util.Scanner;
public class PrimToObj {
	  public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an integer value: ");
	    int a = sc.nextInt();

	    Integer i = Integer.valueOf(a);
	    Integer j = a; 

	    System.out.println(a + " " + i + " " + j);

	    sc.close();
	  }
	}

