import java.util.Scanner;

public class Conditional {
    
    public static void main(String[] args){
        //  conditional if else statements

        Boolean isLoggedIn = true;
        if(isLoggedIn == true)
            System.out.println("Your are logged in");
        else    
            System.out.println("your are not login");    
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        if(age > 18)
            System.out.println("Vote");
        else
            System.out.println("can't vote");    


       

    }
}
