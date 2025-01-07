import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        // P(1 + R/100)t 
        //  power 
        // program to calculate compund interest
        Scanner pa = new Scanner(System.in);
        Scanner ra = new Scanner(System.in);
        Scanner ta = new Scanner(System.in);


        // input principle, rate and time from user
        System.out.println("calculate compund interest");
        
        System.out.print("Enter principle: ");
        double p = pa.nextDouble();
        
        System.out.print("Enter rate: ");
        double r = ra.nextDouble();
        
        System.out.print("Enter time: ");
        double t = ta.nextDouble();
        
        // calculate
        double CI = p * Math.pow((1 + r/100), t);

        // show output
        System.out.println("Compound Interest is: " + CI);


    }    
}
