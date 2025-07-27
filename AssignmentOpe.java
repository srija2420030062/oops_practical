package oops_practical;
import java.util.Scanner;
public class AssignmentOpe {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a number (a): ");
	    int a = sc.nextInt();
	    int var;

	    var = a;
	    System.out.println("var using =: " + var);

	  
	    var += a;
	    System.out.println("var using +=: " + var);

	    var *= a;
	    System.out.println("var using *=: " + var);

	    sc.close();
	  }
	}


