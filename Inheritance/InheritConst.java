import java.util.*;

class dimension {
    double length;
    double breadth;
    double height;

    dimension(dimension ob) {
        length = ob.length;
        breadth = ob.breadth;
        height = ob.height;
    }

    dimension() {
        length = breadth = height = -1;
        System.out.println("Invalid Entry");
    }

    dimension(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    dimension(double len) {
        length = breadth = height = len;
    }

    double TotalVol() {
        return length * breadth * height;
    }

}

class shape extends dimension {
    String name;

    shape(double len, String s) {
        length = breadth = height = len;
        name = s;

    }

    shape(double l, double b, double h, String s) {
        length = l;
        breadth = b;
        height = h;
        name = s;
    }
}

public class InheritConst {
    public static void main(String[] args) {
        shape shape1 = new shape(10, 20, 14, "Cuboid");
        shape shape2 = new shape(10, "Cube");

        double volume;

        volume = shape1.TotalVol();
        System.out.println();
        System.out.println("Volume of Shape 1: " + volume);
        System.out.println("The shape is a: " + shape1.name);
        System.out.println();

        volume = shape2.TotalVol();
        System.out.println("Volume of Shape 2: " + volume);
        System.out.println("The shape is a: " + shape2.name);

    }
}
