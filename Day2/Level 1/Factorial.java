import java.util.*;

public class Factorial{
	public static void main(String[] args) {
	
		//Taking input of Number 
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int product = 1;
		while(number >= 1) {
			product *= number;
			number--;
		}

		System.out.println("The factorial is "+ product);
		
	}
}
