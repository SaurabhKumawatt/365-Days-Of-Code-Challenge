
import java.util.Scanner;

public class mulFloat {
    public static void main(String[] args) {
        // multiply two floating points

        Scanner f = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter first float number: ");
        float f1 = f.nextFloat();

        System.out.print("Enter second floating number: ");
        float f2 = fn.nextFloat();
 
        // to store the multiplied value
        float p = f1 * f2;
 
        // to print the product
        System.out.println("The product is: " + p);
    }
}
