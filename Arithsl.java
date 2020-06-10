import java .util. Scanner;

	public class Arithsl {
	
	public static void main(String[]   args) {

	Scanner input = new Scanner (System.in);
	
	int n1, n2, n3,product,sum,average, smallest,largest ;
	
	System.out.println("Enter first number :");

		n1 = input.nextInt();
	
	System.out.println("Enter second number :");

		n2 = input.nextInt();
	
	System.out.println("Enter third number :");

		n3 = input.nextInt();


		sum = n1 +n2 + n3;
	
	System.out.printf(" The sum is %d%n", sum);
	
		product = n1*n2* n3 ;
	
	System.out.printf( " The product is %d%n", product);

		average = (n1 + n2 + n3) /3 ;
	System.out.printf( " The Average is %d%n" , average);

		if (n1 > n2 && n1> n3)
	System.out.printf (" The Largest number is %d%n");
		
		if (n1 < n2 && n2<  n3)
	System.out.printf(" The Smallest number is %d%n", n1);

		if (n2> n1&& n2  > n3 )
	System.out.printf (" The Largest number is %d%n",n2);
	
		if (n2 < n1&& n2<n3 )
	System.out.printf (" The Smallest number is %d%n", n2);
	 
	 

		if (n3 > n2 && n3> n1)
	System.out.printf(" The Largest number is %d%n" ,n3);
		
		if (n3 < n2 && n3 < n1)
	System.out.printf(" The Smallest number is %d%n" , n3);






	


	



	
	 




}}