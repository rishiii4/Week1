import java.util.*;
public class SideOfSquare{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of perimeter
		System.out.println("Enter perimeter: ");
		float perimeter = input.nextFloat();
	
		//Calculating side of square
		float side = perimeter / 4;
		
		
		System.out.println(" The length of the side is "+ side + " whose perimeter is " + perimeter);


	}	
}