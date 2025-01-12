import java.util.*;

public class ReFactorial{
	public static void main(String[] args) {
	
		//Taking input of Number 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		int product = 1;
		for(int i = 1; i<number; i++){
			product *= i;
		}

		System.out.println("The factorial is "+ product);
		
	}
}