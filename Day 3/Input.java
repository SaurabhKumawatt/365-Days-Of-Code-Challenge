
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        //  input


         // string
         Scanner st = new Scanner(System.in);
         System.out.print("Enter yout name: ");
         String name = st.next();
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your age: ");
         int age = sc.nextInt();
         
        System.out.println(name);
        System.out.println(age);


       
    }


}
