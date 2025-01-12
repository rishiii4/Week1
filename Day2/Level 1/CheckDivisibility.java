import java.util.*;
public class CheckDivisibility{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input of number
		System.out.println("Enter the Number to check: ");
		int number = sc.nextInt();
		
		//Checking if number is divisible by 5 or not
		if(number % 5 == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}	

	}	
}