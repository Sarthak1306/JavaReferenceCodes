import java.util.*;

class calculate {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers is: " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference of the numbers is: " + z);
    }

}

public class InheritanceCode extends calculate {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the two numbers is: " + z);
    }

    public static void main(String[] args) {
        int a = 30, b = 5;
        InheritanceCode obj = new InheritanceCode();
        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
    }

    public void division(int x, int y) {
        z = x / y;
        System.out.println("The remainder of the two numbers is: " + z);
    }

}