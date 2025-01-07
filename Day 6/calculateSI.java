import java.util.Scanner;

public class calculateSI{
    public static void main(String[] args) {
        // calculate simple interest
        Scanner pa = new Scanner(System.in);
        Scanner ra = new Scanner(System.in);
        Scanner ta = new Scanner(System.in);


        // Input Principle, rate and time from user  
        System.out.println("Program to check Simple interest-->");
        System.out.print("Enter principle amount: ");
        double p = pa.nextDouble();
        
        System.out.print("Enter Rate of interest: ");
        double r = ra.nextDouble();
        
        System.out.print("Enter Time: ");
        double t = ta.nextDouble();

        // calculate simple interest
        double SI = (p * r * t)/100;
        
        // show output to user
        System.out.println("Simple Interest is: " + SI);

    }
}