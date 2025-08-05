package oops_practical;

class Box5 {
    double width;
    double height;
    double depth;

    // ✅ Correct constructor name
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String args[]) {
        // declare, allocate, and initialize Box objects
        Box5 mybox1 = new Box5(10, 20, 15); 
        Box5 mybox2 = new Box5(3, 6, 9); 
        double vol; 
        
        // get volume of first box 
        vol = mybox1.volume(); 
        System.out.println("Volume is " + vol);
        
        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println("Volume is " + vol);
    }
}
