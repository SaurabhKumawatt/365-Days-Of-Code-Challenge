
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        // taking string from user
        System.out.print("Enter your name: ");
        Scanner nm = new Scanner(System.in);
        String name = nm.next();

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + num);

        
    }    
}
