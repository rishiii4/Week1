import java.util.*;
public class SwapNumbers{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of 1st Number
		System.out.println("Enter 1st Number: ");
		int number1 = input.nextInt();
		
		//Taking Input of 2nd Number
		System.out.println("Enter 2nd Number: ");
		int number2 =  input.nextInt();
		
		//Swapping Numbers
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
	}	
}