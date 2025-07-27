package oops_practical;
import java.util.Scanner;
public class Add2num {
	
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);

	    System.out.print("Type a number: ");
	    int x = myObj.nextInt();

	    System.out.print("Type another number: ");
	    int y = myObj.nextInt();

	    int sum = x + y;
	    System.out.println("Sum is: " + sum);

	    myObj.close();
	    


}
}
