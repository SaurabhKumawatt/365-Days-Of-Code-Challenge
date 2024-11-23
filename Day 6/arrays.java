
import java.util.Arrays;


public class arrays {
    public static void main(String[] args) {
        int [] marks = {90, 95, 85};
        System.out.println(marks[0]);

        // length of array
        System.out.println(marks.length);

        // sort an array
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2d arrays
        int[][] finalMarks = {
            {90, 85, 95},
            {85, 88, 97}
        };
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][0]);
    }    
}
