
import java.util.Scanner;

public class factorial {

    // iterative method - loops
    public static void facIterative(int num){
        int i;
        int f = 1;
        for (i = 1; i <= num; i++)
            f*= i;
    
        System.out.println(f);

    }

    public static int factRecur(int number){
        if(number == 0)
            return 1;
        int fact = number * factRecur(number -1);
           return fact;
            
    }



    public static void main(String[] args) {
        // Find Factorial of a Number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        // output
        System.out.print("Factorial of " + num + " is: ");

        facIterative(num);
        
        System.out.println(factRecur(num));

       

    }

}
