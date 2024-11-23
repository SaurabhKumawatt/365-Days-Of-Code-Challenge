public class casting {
    public static void main(String[] args) {
        // implicit casting --> automatic casting int to double
        int num = 10;
        double myNum = num;
        System.out.println(myNum);

        // explicit casting - manual casting
        double dNum = 10.5;
        int newNum = (int)dNum;
        System.out.println(newNum);
    }    
}
