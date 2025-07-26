package oops_practical;
import java.util.Scanner;

public class Bitwise_LS_RS_Zero {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("Enter value for a: ");
	      int a = sc.nextInt();
	      int c = 0;

	      c = a << 2;
	      System.out.println("a << 2 = " + c);

	      c = a >> 2;
	      System.out.println("a >> 2 = " + c);

	      c = a >>> 2;
	      System.out.println("a >>> 2 = " + c);

	      sc.close();
	   }
	}
