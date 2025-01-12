import java.util.*;
public class WeightConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Weight in Pounds
		System.out.println("Enter Weight in Pounds: ");
		float weightInPounds = input.nextFloat();
		
		//Converting Weight in Pounds into Kg (1 pounds = 2.2kg)
		float poundsToKg = weightInPounds * 2.2f;
			
		System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + poundsToKg);
	}	
}