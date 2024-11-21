public class loops {
    public static void main(String[] args) {
        // for
        // print 1 to 100 and 100 to 1
        for(int i=1; i <= 100; i++){
            System.out.println(i);
        }
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }

        // while loop
        // print 1 to 100 and 100 to 1
        int i = 1;
        while(i <= 100) {
            System.out.println(i);
            i++;
        }
        int j = 100;
        while( j >= 1){
            System.out.println(j);
            j--;
        }

        // do while loop
         // print 1 to 100 and 100 to 1
         int k = 1;
         do { 
             System.out.println(k);
             k++;
         } while (k <= 100);
         int l = 100;
         do {
            System.out.println(l);
            l--;
         } while( l >= 1);
    }    
}
