import java. util.Scanner;
	
	public class Compare{

	public static void main(String[]   args){

	Scanner input = new Scanner(System.in);

	int num1,num2;
	
	System.out.println("Enter first integer : ");
		num1=input.nextInt();

	System.out.println("Enter second integer : ");
		num2= input.nextInt();


	if ( num1 > num2)
	System.out.printf(" %d%s%n", num1, " is larger");
	
	if ( num2 > num1)
	System.out.printf(" %d%s%n", num2, " is larger");
	
	if ( num1 == num2)
	System.out.printf(" %s%n",  " These numbers are equal");		
	













}
	}