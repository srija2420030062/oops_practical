package oops_practical;
import java.util.Scanner;
public class Logicaloper {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter first number: ");
	    int x = sc.nextInt();
	    System.out.print("Enter second number: ");
	    int y = sc.nextInt();

	    System.out.println((x > y) && (x != y));  
	    System.out.println((x < y) || (x == y));  
	    System.out.println(!(x == y));             

	    System.out.print("Enter value for a: ");
	    int a = sc.nextInt();
	    int var;

	    var = a;
	    System.out.println("var using =: " + var);

	    var += a;
	    System.out.println("var using +=: " + var);
	    sc.close();
	    
}
}
