package oops_practical;
import java.util.Scanner;

public class BitwiseXOR_Comp {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("Enter value for a: ");
	      int a = sc.nextInt();

	      System.out.print("Enter value for b: ");
	      int b = sc.nextInt();

	      int c = a ^ b;
	      System.out.println("a ^ b = " + c);

	      c = ~a;
	      System.out.println("~a = " + c);

	      sc.close();
	   }
	}


