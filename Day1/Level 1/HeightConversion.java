import java.util.*;
public class HeightConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Height in Centimeters
		System.out.println("Enter Height in Centimeter: ");
		int heightInCm = input.nextInt();
	
		float heightInInch = heightInCm / 2.54f;
		
		float heightInFeet = heightInInch / 12f;
		
		
		System.out.print("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInch);
	}	
}