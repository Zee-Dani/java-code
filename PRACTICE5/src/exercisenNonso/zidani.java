package exercisenNonso;
import java.util.Scanner;
public class zidani {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        int j = 1;
        do{
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Enter second number :");
            int num2 = input.nextInt();
            int sum = num1 + num2 ;
            System.out.printf("%d%n is the sum ", sum );
            System.out.println("press -1 to quit or 1 to continue :");
            j = input.nextInt();

        }while(j != -1);






    }

}
