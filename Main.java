package oops_practical;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter first number (a): ");
    int a = sc.nextInt();

    System.out.print("Enter second number (b): ");
    int b = sc.nextInt();
    
    System.out.println("a + b = " + (a + b));


    System.out.println("a - b = " + (a - b));


    System.out.println("a * b = " + (a * b));


    System.out.println("a / b = " + (a / b));


    System.out.println("a % b = " + (a % b));

    sc.close();
  }
}

