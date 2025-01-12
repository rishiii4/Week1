import java.util.*;
public class AreaOfTriangle{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of base
		System.out.println("Enter Base: ");
		float base = input.nextFloat();
	
		//Taking input of height
		System.out.println("Enter Height: ");
		float height = input.nextFloat();
		
		//Calculating area in Centimeter
		double areaInCm = 1.0/2.0 * base * height;
		
		//Calculating area in inch
		double areaInInch = areaInCm / 2.54f;
		
		
		System.out.println("Your Area in cm is "+ areaInCm +" and inches is "+ areaInInch);


	}	
}