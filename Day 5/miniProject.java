
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        // guess the number 
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int yourNumber;
        do { 
            System.out.print("Guess a number(1-100): ");
            yourNumber = sc.nextInt();

            if (myNumber == yourNumber) {
                System.out.println("WOOHOO... Correct Number!!!");
                break;
            }
            else if (myNumber > yourNumber) {
                System.out.println("Your number is too small!!!");
            }
            else{
                System.out.println("Your Number is too large!!!");
            }
        } while (yourNumber >= 0);
        System.out.print("My number is: ");
        System.out.println(myNumber);
    }

}
