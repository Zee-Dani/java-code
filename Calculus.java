import java.util.Scanner;
public class Calculus{
	public static void main(String...args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumber = input.nextInt();

		System.out.println("enter second number");
			int secondNumber = input.nextInt();
	
		System.out.println("enter third number");
			int thirdNumber = input.nextInt();
			int result = firstNumber + secondNumber;
			
	if ( result > thirdNumber){
			System.out.println(result);
			
			}
	if (thirdNumber > result){
			
		System.out.println(thirdNumber);
			}
	}
}