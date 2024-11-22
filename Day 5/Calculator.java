
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double fNUm, sNum;
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        System.out.print("Enter first number: ");
        fNUm = a.nextDouble();
        System.out.print("Enter operator (+, -, *, /): "); 
        operator = op.next().charAt(0);
        System.out.print("Enter a second number: ");
        sNum = b.nextDouble();

        double sum = fNUm + sNum;
        double sub = fNUm - sNum;
        double mul = fNUm * sNum;
        double div = fNUm / sNum;

        switch (operator) {
            case '+':
                System.out.println(sum);
                break;
            case '-' :
                System.out.println(sub);
                break;
            case '*' :
                System.out.println(mul);
                break;
            case '/' :
                System.out.println(div);
                break;

            default:
                throw new AssertionError();
                
        }
    
    }
}
