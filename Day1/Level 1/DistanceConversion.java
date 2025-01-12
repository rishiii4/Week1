import java.util.*;
public class DistanceConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of distance in feets
		System.out.println("Enter Distance in feet: ");
		double distanceInFeet  = input.nextDouble();
	
		//Calculating distance in yards
		double distanceInYards = distanceInFeet / 3.0d;
		
		//Calculating distance in miles
		double distanceInMiles = distanceInYards / 1760.0;
		
		
		System.out.println("the distance in yards " + distanceInYards + " and in miles " + distanceInMiles);


	}	
}