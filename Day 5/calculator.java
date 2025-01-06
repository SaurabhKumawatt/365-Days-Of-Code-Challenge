import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // calculator using switch case

        Scanner fn = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        do { 
            System.out.print("Enter First number: ");
            double firstNum = fn.nextDouble();
    
            System.out.print("Enter operator(+, -, *, /, %): ");
            String operator = o.nextLine();
    
            System.out.print("Enter Second number: ");
            double secondNum = sn.nextDouble();
    
    
            double sum = firstNum + secondNum;
            double diff = firstNum - secondNum;
            double mul = firstNum * secondNum;
            double div = firstNum / secondNum;
            double mod = firstNum % secondNum;
            
            switch (operator) {
                case "+":
                    System.out.println(sum);
                    break;
            
                case "-":
                    System.out.println(diff);
                    break;
                case "*":
                    System.out.println(mul);
                    break;
                case "/":
                    System.out.println(div);
                    break;
                case "%":
                    System.out.println(mod);
                    break;
                default:
                    System.out.println("You entered wrong operator");
                    break;
            }
        } while (true);
       

    }
}
