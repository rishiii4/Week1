import java.util.*;
public class IntOperations{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number 1
		System.out.println("Enter 1st Number: ");
		int a = input.nextInt();
		
		//Taking input of Number 2
		System.out.println("Enter 2nd Number: ");
		int b = input.nextInt();
		
		//Taking input of Number 3
		System.out.println("Enter 3rd Number: ");
		int c = input.nextInt();
	
		//Performing Operations 
		int result1 =  a + b *c;  
		
		int result2 = a * b + c;
		
		int result3 = c + a / b;
		
		int result4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + result1 +"," + result2 +"," + result3 + " and " + result4);

	}	
}