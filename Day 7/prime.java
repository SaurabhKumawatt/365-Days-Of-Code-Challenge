
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        // is prime or not
        
        Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        int count = 0;
        // checking
        for (int i = 0; i < num; i++) {
            if(num % 1 == 0 ){
                count++;
            }
        }

        // prime number divide by 1 or itself, the divide count is 2 
        if(count == 2){
            System.out.println( num + " is prime number.");
        } else{
            System.out.println( num + " is not prime number.");
        }
    }
}
