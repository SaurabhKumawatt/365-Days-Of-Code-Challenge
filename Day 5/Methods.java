public class Methods {

    // printJava method
    public static void printJava(){
        System.out.println("Hello, Java User!");
    }

    // arg --> name
    public static void printName(String name){
        System.out.println(name);
    }

    // sum of two number
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    // name with times
    public static void printNameT(String name, int a){
        
        for (int i = 0; i < a; i++) {
             System.out.println(name);           
        }
    }

    public static void main(String[] args) {
        // call print java function
        printJava();
        printJava();

        // call print name method
        printName("Saurabh");
        printName("Hello, Saurabh!");

        // call sum of two num fnc
        printSum(5, 6);

        // call the function
        printNameT("Saurabh", 15);
    }
}
