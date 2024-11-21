public class logicalop {

    public static void main(String[] args) {
        // logical operators
        //  &&
        int a = 5;
        int b = 10;

        if( a >= 5 && b <= 15)
            System.out.println("both true");
    
        //  || 
        if( a > 5 || b <= 10)
            System.out.println("atleast any one true");

        // !
        Boolean isAdult = true;
        if(!isAdult)
            System.out.println("adult");
        else
            System.out.println("not adult"); 
    }
}
