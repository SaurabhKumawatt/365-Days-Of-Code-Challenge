public class Logical {
    public static void main(String[] args) {
        // logical operators
        // && - both values are true
        int a = 40;
        int b = 30;
        if(a < 50 && b < 50 )
            System.out.println("both less than 50");
       


        // or - any one true
        int c = a;
        int d = 60;
        if(c < 50 || d < 50)    
            System.out.println("atleast one less than 50");


        // not - reverse the result
        boolean isAdult = true;
        if(!isAdult)
            System.out.println("adult");
        else
            System.out.println("not adult");
    }
}
