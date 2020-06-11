import  java.util.Scanner;
	public class Multiples{ 
		public static void main(String...args){
		Scanner input = new Scanner (System.in);
		System.out.println("enter first digit:");
		int firstDigit = input.nextInt();
		
		System.out.println("enter second digit:");
		int secondDigit = input.nextInt();

		if (firstDigit % secondDigit == 0){
		System.out.println("second digit is a multiple of firstDigit");
		}
		
		if (secondDigit % firstDigit == 0){
		System.out.println("first digit is a multiple of second digit");
		}



}





}