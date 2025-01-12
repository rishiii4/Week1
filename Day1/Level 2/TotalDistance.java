import java.util.*;
public class TotalDistance{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Name
		System.out.println("Enter Name: ");
		String name = input.nextLine();
		
		//Taking input of fromCity
		System.out.println("Enter From City: ");
		String fromCity = input.nextLine();
		
		//Taking input of viaCity
		System.out.println("Enter Via City: ");
		String viaCity = input.nextLine();
		
		//Taking input of toCity
		System.out.println("Enter To City: ");
		String toCity = input.nextLine();
		
		//Taking input of Distance from to viaCity
		System.out.println("Enter Distance fromToVia in Km: ");
		double distanceFromToVia = input.nextDouble();
		
		//Time taken in distanceFromToVia
		System.out.println("Enter Time Taken FromToVia in Minutes: ");
		int timeFromToVia = input.nextInt();
		
		//Taking input of Distance from to via to final city
		System.out.println("Enter Distance via to final city in Km: ");
		double viaToFinalCity = input.nextDouble();
		
		//Taking input of Tatal time taken
		System.out.println("Enter Time Taken from via to final city in Minutes: ");
		int timeViaToFinalCity = input.nextInt();
		
		//Total Distance
		double totalDistance = distanceFromToVia + viaToFinalCity;
		
		//Total time taken
		int totalTime = timeFromToVia + timeViaToFinalCity;
		
		System.out.println("The Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the total time taken is " + totalTime + " minutes.");
	}	
}