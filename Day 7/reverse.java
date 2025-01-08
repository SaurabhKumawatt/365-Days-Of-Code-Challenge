
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // to reverse string
        Scanner sc = new Scanner(System.in);

        // input string from user
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev = "";

        char st[] = s.toCharArray();

        for (int i = st.length- 1; i >= 0 ; i--){
            // System.out.println(st[i]);
            rev = rev + st[i];           
        }
            
        
        // output of reverse string
        System.out.println(rev);
    }
}
