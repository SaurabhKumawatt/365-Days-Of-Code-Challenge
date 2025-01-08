
import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        // permeter of rectangle - P = (L + W) × 2,
        Scanner l = new Scanner(System.in);
        Scanner w = new Scanner(System.in);

        // input from user
        System.out.print("Enter length of rectangle: ");
        int length = l.nextInt();

        System.out.print("Enter width of rectangle: ");
        int width = w.nextInt();

        int perimeter = (length * width) * 2;
        
        // output
        System.out.println(perimeter);

    }
}
