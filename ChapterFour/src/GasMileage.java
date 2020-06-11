import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args){
        double totalTrip = 0;
        int countTrip = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles per Trip or -1 to quit");
        int miles = input.nextInt();

        System.out.println("Enter gallons per Trip or -1 to quit");
        int gallons = input.nextInt();
        double trip = (double) miles /gallons ;
        System.out.printf("Trip %d has %.2f miles per gallon%n",countTrip,trip);

        while (miles != -1){
             totalTrip = totalTrip + trip;
             countTrip = countTrip + 1;

            System.out.println("Enter miles per Trip or -1 to quit");
            miles = input.nextInt();
            System.out.println("Enter gallons per Trip or -1 to quit");
            gallons = input.nextInt();
            trip = (double)miles /gallons ;
            System.out.printf("Trip %d  has %.2f miles per gallon%n",countTrip,trip);

        }
        System.out.printf("%.2f miles per gallon is the total of the combined Trip ",totalTrip );
    }



}
