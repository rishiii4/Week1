import java.util.*;
public class QuotientRemainder{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Number 1
		System.out.println("Enter 1st Number: ");
		float number1 = input.nextFloat();
		
		//Taking input of Number 2
		System.out.println("Enter 2nd Number: ");
		float number2 = input.nextFloat();
	
		
		//Calculating Quotient 
		float quotient = number1 / number2;
		
		//Calculating Remainder
		float remainder = number1 % number2;
		
		System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 +" and " + number2);


	}	
}