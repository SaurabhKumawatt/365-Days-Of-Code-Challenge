
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // top check palindrome string
        Scanner sc = new Scanner(System.in);

        // input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // reverse string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
           rev = rev + str.charAt(i); 
        }

        if(str.equals(rev)){
            System.out.println("String is palindrome");
        } 
        else{
            System.out.println("String is not palindrome");

        }

    }
}
