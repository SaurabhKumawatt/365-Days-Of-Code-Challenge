public class Functions {

    // java function
    public static void printJava() {
        System.out.println("Hello java user");
    }
    // sum of two numbers
    public static void sumNum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    // print input string
    public static void printName(String name) {
        System.out.println(name);
    }
    // substraction of two number
    public static void subNum(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public static void main(String[] args) {

        printJava();

        sumNum(10, 5);

        printName("saurabh");

        subNum(10, 5);
    }    
}
