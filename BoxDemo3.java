package oops_practical;
class Box2
{ 
  double width; 
  double height;
  double depth; 

//display volume of a box 
void volume() 
   { 
     System.out.print("Volume is ");
     System.out.println(width * height * depth); 
    }
}
public class BoxDemo3
{ 
 public static void main(String args[])
  { 
    Box2 mybox1 = new Box2(); 
    Box2 mybox2 = new Box2();

//assign values to mybox1's instance variables
   mybox1.width = 10; 
   mybox1.height = 30; 
   mybox1.depth = 15;

/* assign different values to mybox2's instance variables */
  mybox2.width = 3;
  mybox2.height = 6; 
  mybox2.depth = 8; 
 
//display volume of first box 
  mybox1.volume(); 
 
//display volume of second box 
   mybox2.volume();
   }
}
