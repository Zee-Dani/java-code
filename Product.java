import java.util.Scanner;
	public class Product{
	public static void main(String[]  args){
	Scanner input = new Scanner(System.in);
	
	int x,y,z,result;

	System.out.print("Enter first number:");
			x=input.nextInt();
	System.out.print("Enter second number:");
			y=input.nextInt();
	System.out.print("Enter third number:");
			z=input.nextInt();
	result = x * y * z;
	
	System.out.printf("product is %d%n",result);	


}
}









