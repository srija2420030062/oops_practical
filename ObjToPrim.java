package oops_practical;
import java.util.Scanner;
public class ObjToPrim {
	  public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an integer value: ");
	    int input = sc.nextInt();

	    Integer a = Integer.valueOf(input);

	    int i = a.intValue(); 
	    int j = a;           

	    System.out.println(a + " " + i + " " + j);

	    sc.close();
	  }
	}

