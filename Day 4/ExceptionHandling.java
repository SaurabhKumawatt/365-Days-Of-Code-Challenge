
import java.util.Scanner;


public class ExceptionHandling {
    public static void main(String[] args){
        int marks[] = {75, 85, 95}; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subject to get mark: ");
        int mark = sc.nextInt();
        
        // if student enter a number range more than 2 the output of program is gives an error or crash 
        //  so we can catch error and show error to the user 
        try {
            System.out.println("Your mark is: " + marks[mark]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Subject not exist! Please enter a number that match with your subject.");

            
        }

    }    
}
