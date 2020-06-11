import java.util.Scanner;
public class Largest{
	public static void main (String... args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int firstNumber = input.nextInt();
	
	System.out.println("Enter second number");
	int secondNumber = input.nextInt();
	
	System.out.println("Enter third number");
	int thirdNumber = input.nextInt();
	
	
	if(firstNumber > secondNumber && firstNumber > thirdNumber){
	System.out.printf("%d is the largest number%n", firstNumber);
	}

	if(secondNumber > firstNumber && secondNumber > thirdNumber){
	System.out.printf("%d is the largest number %n", secondNumber);
	}

	
	if(thirdNumber > firstNumber && thirdNumber > secondNumber){
	System.out.printf("%d is the largest number%n", thirdNumber);
	}
	
	if(firstNumber < secondNumber && firstNumber < thirdNumber){
	System.out.printf("The smallest number is %d", firstNumber); 
	}
	
	if(secondNumber < firstNumber && secondNumber < thirdNumber){
	System.out.printf("The smallest number is %d", secondNumber);
	}
	
	if(thirdNumber < firstNumber && thirdNumber < secondNumber){
	System.out.printf("the smallest Number is %d", thirdNumber);
	}    



}





 }