import java.util.*;
public class CalculatingRounds{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of 1st side
		System.out.println("Enter 1st side in Meter: ");
		int side1 = input.nextInt();
		
		//Taking Input of 2nd side
		System.out.println("Enter 2nd side in Meter: ");
		int side2 =  input.nextInt();
		
		//Taking Input of 3rd side
		System.out.println("Enter 3rd side in Meter: ");
		int side3 =  input.nextInt();
		
		//Sum of all sides
		int perimeter = side1 + side2 + side3;
		
		//Total Distance in meter
		int totalDistance = 5000;
		
		//Calculating Rounds
		int rounds = totalDistance / perimeter;
			
		System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
	}	
}