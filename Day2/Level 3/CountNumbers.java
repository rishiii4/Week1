import java.util.*;
public class CountNumbers{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		//Initializing Count as 0
		int count = 0;
		
		//Creating loop to calculate the number of digits
		while(number != 0){
			number = number / 10;
			count++;
		}		
		System.out.println(count);
	}	
}