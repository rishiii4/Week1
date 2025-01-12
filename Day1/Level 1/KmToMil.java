import java.util.*;
public class KmToMil{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Taking input in KM
		double km = input.nextDouble();
		
		//Converting KM to Miles
		double miles = km / 1.6;
		
		System.out.print("The total miles is " + miles + " for the given " + km +" km");
	}	
}