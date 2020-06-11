package Chapter7;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Excercise {
    public static void main(String[]  args){
        int[] g = {8, 8, 8, 8, 8};
        System.out.println(Arrays.toString(g));

        float [] c = new float[100];
        float sum = 0;
        for (int i=0 ; i < c.length;i++){
            sum = i + sum;
        }
        System.out.println();
        System.out.println(sum);

        int[]f = {1, 2, 3, 4, 5, 16, 17, 8, 9, 10};
        System.out.println(f[6]);

    }


}
