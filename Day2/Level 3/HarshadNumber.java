import java.util.*;
public class HarshadNumber{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		//Original number for later comparison
		int orgNum = number;
		
		//Initializing Count as 0
		int sum = 0;
		
		//Creating loop to calculate the number of digits
		while(number != 0){
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		}
		
		// Checking if the original number is divisible by the sum of its digits
		if(orgNum % sum == 0){
			System.out.println("Harshad Number");
		}else{
			System.out.println("Not a Harshad Number");
		}
	}	
}