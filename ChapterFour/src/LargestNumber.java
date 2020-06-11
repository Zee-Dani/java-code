import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int count = 1;
        int largest = 0;
        int largest2 = 0;
        Scanner input = new Scanner(System.in);


        while (count <= 7) {
            System.out.print("Enter next number :");
            int num = input.nextInt();
            if (num > largest) {
                largest2 = largest;

                largest = num;

            }
            else
                if (num > largest2)
            largest2 = num;

            count++;
        }


        System.out.printf("Largest number is %d and %d%n", largest, largest2);
    }
}



