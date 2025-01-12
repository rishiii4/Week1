import java.util.*;
public class DoubleOperations{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number 1
		System.out.println("Enter 1st Number: ");
		double a = input.nextDouble();
		
		//Taking input of Number 2
		System.out.println("Enter 2nd Number: ");
		double b = input.nextDouble();
		
		//Taking input of Number 3
		System.out.println("Enter 3rd Number: ");
		double c = input.nextDouble();
	
		//Performing Operations 
		double result1 =  a + b *c;  
		
		double result2 = a * b + c;
		
		double result3 = c + a / b;
		
		double result4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + result1 +"," + result2 +"," + result3 + " and " + result4);

	}	
}