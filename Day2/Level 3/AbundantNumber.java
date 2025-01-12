 import java.util.*;
public class  AbundantNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.println("Enter Number:");
		int number = input.nextInt();
		
		int sum = 0;
		
		//Creating loop to calculate sum
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				sum = sum + i;
			}	
		}
		
		//Checking if number is Abundant or not
		if(sum > number){
			System.out.println("Abundant Number");
		}else{
			System.out.println("Not an Abundant Number");
		}
		
	}
}