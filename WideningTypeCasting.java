package oops_practical;
import java.util.Scanner;
public class WideningTypeCasting {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an integer value: ");
	    int i = sc.nextInt();  

	    long l = i;    
	    double d = i;   

	
	    System.out.println("Integer: " + i);
	    System.out.println("Long: " + l);
	    System.out.println("Double: " + d);

	    sc.close();
	  }
	}

