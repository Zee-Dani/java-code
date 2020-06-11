import java.util.Scanner;

public class Binary {

    public static void main(String[]  args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a binary number :");
        int q= input.nextInt();
        int count = 0;
        int remainder = (q % 10);

        int num = remainder * ((int) Math.pow(2, count));
        //System.out.println(num);
        while (q!=0){
            q = (q / 10);
            remainder = (q % 10);
            count++;
            num += remainder * ((int) Math.pow(2, count));
        }
        System.out.println(num);
        //while(q != 0){
       // count++;
    //}




    }
}
