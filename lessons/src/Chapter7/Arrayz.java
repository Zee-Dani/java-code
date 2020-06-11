package Chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayz {
    public static void main(String[]   args){
        int[] cohortThree = new int[8];
        System.out.println(Arrays.toString(cohortThree));

        String[] males = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names of the Males:");
        males[0] = input.nextLine();
        males[1] = input.nextLine();
        males[2]= input.nextLine();
        System.out.println(Arrays.toString(males));

        String[] ladies = new String[5];
        System.out.println("enter a ladies name ");

        for (int i=0 ;i < ladies.length;i++){

            ladies[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(ladies));
    }

}
