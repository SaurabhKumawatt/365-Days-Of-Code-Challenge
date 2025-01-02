public class casting {
    public static void main(String[] args){
        // casting
        // implicit - auto casting
        double price = 100.00;
        double tax = price + 18;
        System.out.println(tax);

        float nprice = 50.00F;
        float ntax = nprice + 9;
        System.out.println(ntax);

        // explicit casting = manual casting
        int p = 100;
        int t = p + (int)10.5;
        System.out.println(t);

        int np = 50;
        int nt = np + (int)5.5F;
        System.out.println(nt);

    }    
}
