
import java.util.Scanner;

public class GuessNUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNUmber;

        do {
            System.out.print("Enter guess number: ");
            userNUmber = sc.nextInt();
            if (userNUmber == myNumber) {
                System.out.println("WOOHOO!...Your number is correct");
                break;
            } else if( userNUmber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too short");
            }

        } while( userNUmber >= 0 );
        System.out.print("My number is: ");
        System.out.println(myNumber);
    }
}
