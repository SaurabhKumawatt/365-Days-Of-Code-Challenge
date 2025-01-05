import java.util.Scanner;

public class dowhileex {
    public static void main(String[] args){
        // do while excercise
        //  if user enter negative number the loop is exit

        Scanner sc = new Scanner(System.in);
        int num;
        do { 
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            System.out.println("your number is " + num);
        } while (num >= 1);
        System.out.println("THE END!");
    }    
}
