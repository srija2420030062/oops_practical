package oops_practical;
import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // input values
    System.out.print("Enter value for a: ");
    int a = sc.nextInt();

    System.out.print("Enter value for b: ");
    int b = sc.nextInt();

    int result1, result2;

 
    System.out.println("Value of a: " + a);

   
    result1 = ++a;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + b);

    result2 = --b;
    System.out.println("After decrement: " + result2);

    sc.close();
  }
}

