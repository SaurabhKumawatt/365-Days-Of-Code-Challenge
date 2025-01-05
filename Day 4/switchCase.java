
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        // day 4 of 365 days of code challenge
        // conditional statement -- switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to know day: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");    
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You enter wrong number");
        }



    }   
}
