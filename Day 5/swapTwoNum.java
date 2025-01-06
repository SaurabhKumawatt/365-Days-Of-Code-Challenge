
import java.util.Scanner;

public class swapTwoNum {

    public static void swapNum(int a, int b){
        
        System.out.println("Before swapping num(a): " + a );
        System.out.println("Before swapping num(b): " + b);


        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping num(a) is: " + a );
        System.out.println("After swapping num(b) is: " + b);
        

    }

    public static void main(String[] args) {
        // Swap Two Numbers
        Scanner fn = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter first num a: ");
        int firstNum = fn.nextInt();

        System.out.print("Enter second num b: ");
        int secondNum = sn.nextInt();

        swapNum(firstNum, secondNum);


        
    }
}
