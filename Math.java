import java.util.Scanner;
public class Math{
    public static void main(String...args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter firstNumber");
    int firstNumber=input.nextInt();
    System.out.println("Enter secondNumber");
    int secondNumber=input.nextInt();
    System.out.println("Enter third Number");
    int thirdNumber=input.nextInt();
    int result = firstNumber + secondNumber;
    if ( result > thirdNumber){
    System.out.println(result);
     } 
     if (result < thirdNumber){
     System.out.println(thirdNumber);

 }
     }



}   