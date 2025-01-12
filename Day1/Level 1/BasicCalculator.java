import java.util.*;
public class BasicCalculator{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Two Numbers
		System.out.println("Enter Two Numbers: ");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
	
		//Addition of two numbers
		float addition = number1 + number2;
		
		//Subtraction of two numbers
		float subtraction  = number1 - number2;
		
		//Multiplication of two numbers
		float multiplication = number1 * number2;
		
		//Division of two numbers 
		float division = number1 / number2;
		
		
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 +" is "+ 
		addition +","+ subtraction +"," + multiplication +", and "+ division);

	}	
}