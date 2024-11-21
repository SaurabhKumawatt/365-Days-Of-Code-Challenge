public class breakCon {
    public static void main(String[] args) {
        int i = 0;
        while (true) { 
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);        
            i++;
            if(i == 5) {
                break;
            }
        }
        int k = 0;
        do { 
            if( k == 3){
                k++;
                continue;
            }
            System.out.println(k);
            k++;
            if(k == 5){
                break;
            }
        } while (true);
    }    
}
