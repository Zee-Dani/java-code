
import java.util.Scanner;
public class DepositTest {
    public static void main(String[]  args){
        Deposit myDeposit = new Deposit();
        Scanner input = new Scanner(System.in);
        System.out.printf("yoCur intial deposit name is : %n%s%n", myDeposit.getName());

        System.out.println("Please enter your Deposit Name");

        String herDepo = input.nextLine();
        myDeposit.setName(herDepo);
        System.out.println();
        myDeposit.getName();
        System.out.printf("Your designated deposit name is : %n%s%n", myDeposit.getName());
    }


}
