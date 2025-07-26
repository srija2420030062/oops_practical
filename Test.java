package oops_practical;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter value b: ");
		int b = sc.nextInt();
		
		int c;

		      c = a & b;  
		      System.out.println("a & b = " + c);

		      c = a | b;  
		      System.out.println("a | b = " + c);

		      sc.close();
	}

}
