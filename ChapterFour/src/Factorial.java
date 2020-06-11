import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        int number;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = input.nextInt();
        int count = number;


        while (count >1){
            count --;
              number = number*count;
        }

        System.out.println(number);



    }
}
