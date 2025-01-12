import java.util.*;
public class ArmstrongNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.println("Enter Number:");
		int number = input.nextInt();
		
		//Preserving Number for later comparison
		int originalNumber = number;
		
		int sum = 0;
		
		//Creating loop for last digit
		while(originalNumber != 0){
			int lastDigit = originalNumber % 10;
			int cube = lastDigit * lastDigit * lastDigit;
			sum = cube + sum;
			originalNumber = originalNumber / 10;
		}
		
		//Checking if the number is Armstrong or Not
		if(sum == number){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Not a Armstrong Number");
		}
		
	}
}	