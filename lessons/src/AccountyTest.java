
public class AccountyTest{
    public static void main (String[]  args){
        Accounty Account1 = new Accounty("zidani zipya", 5600.00);
        Accounty Account2 = new Accounty("victorious lamb", 186.00);

        System.out.printf("Account1 name  and balance is : %s%n", Account1.getName());
        System.out.printf("Account2 name and balance is: %s%n", Account2.getName());

//        System.out.printf("Account1 name  and balance is : %s%n", Account1.getBalance());
//
//        System.out.printf("Account2 name and balance is: %s%n", Account2.getBalance());

        System.out.printf("%s balance : %.2f%n",Account1.getName(),Account1.getBalance());
        System.out.printf("%s balance : %.2f%n",Account2.getName(),Account2.getBalance());


    }
    }





