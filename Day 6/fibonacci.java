public class fibonacci {
    public static void main(String[] args) {
        //fibonacci series

        int count = 10;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        for(int i = 0; i <= count; i++){
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;        
        }
    }
}
