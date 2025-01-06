
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        // check given number is even or odd
        Scanner sc = new Scanner(System.in);


        System.out.println("Check number is Even or Odd-->");
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Entered Number is even " + num);
        }
        else{
            System.out.println("Entered Number is odd: " + num);
        }

    }
}
