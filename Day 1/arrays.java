import java.util.Arrays;

public class arrays {
    
    public static void main(String[] args) {
        
        int[] markes = new int[3];

        markes[0] = 95;
        markes[1] = 88;
        markes[2] = 90;

        System.out.println(markes[0]);


        // length 
        System.out.println(markes.length);


        //  sort
        Arrays.sort(markes);
        System.out.println(markes[0]);

        // direct assign
        int[] markes1 = {95, 88, 90};

        // 2d arrays
        int[][] finalMarkes = {{95, 88, 90}, {90, 95, 99}};

        System.out.println(finalMarkes[0][0]);
    }


}
