import java.util. Scanner;

public class Arithmetic{

	public static void main(String[]  args){

	Scanner input = new Scanner(System.in);
	int number1 ,number2, product,sum,quotient,difference ;
	
	System.out.print("Enter first number :");
		 number1=input.nextInt();
		
	System.out.print("Enter second number :");
		number2=input.nextInt();

		sum = number1+number2;

	System.out.printf("Sum is %d%n", sum);
		
		product= number1* number2;
	
	System.out.printf( "Product is %d%n",product);	
		
		quotient= number1/number2;

	System.out.printf("Quotient is %d%n", quotient);


		difference=number1 - number2;
		
	System.out.printf("Difference is %d%n",difference);

}
}