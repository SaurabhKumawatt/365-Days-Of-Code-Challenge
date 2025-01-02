
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        // arrays

        int[] marks = new int[4];
        marks[0] = 96;
        marks[1] = 98;
        marks[2] = 95;
        marks[3] = 99;

        System.out.println(marks[0]);

        // methods of arrays
        // length of array
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // 2d arrays
        int[][] fmarks = {{95, 97, 99},{95, 93, 98}};
        System.out.println(fmarks[0][0]);
        System.out.println(fmarks[1][1]);
    }
}
