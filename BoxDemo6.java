
package oops_practical;

class Box4 {  
    double width;   
    double height;  
    double depth; 

    // Correct constructor name
    Box4() {
        System.out.println("Constructing Box"); 
        width = 10;
        height = 10; 
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 { 
    public static void main(String args[]) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4(); 
        double vol; 

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume(); 
        System.out.println("Volume is " + vol); 
    }
}
