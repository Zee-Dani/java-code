import java.util.Scanner;
	public class Oddeven{ 
		public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter number");
		int number = input.nextInt();
		
		if (number %2 == 0){
		System.out.printf("The is an even number %d%n", number);
	 	}
		if (number %2 != 0){
		System.out.printf("This is an odd number %d%n",number);
		}

}

}