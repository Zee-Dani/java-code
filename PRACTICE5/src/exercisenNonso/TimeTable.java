package exercisenNonso;
import java.util.Scanner;
public class TimeTable {
    public static void main (String [] args){
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int counter = 1; counter <= 50; counter++){
            // num * counter = (num *counter);
            System.out.printf("%d x %d = %d%n ", num,counter,(counter * num));
        }
    }
}
