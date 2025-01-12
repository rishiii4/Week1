import java.util.*;

public class SumOfNatural{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		int number = input.nextInt();
		
		if (number < 1) {
			System.out.println("The number " +number + " is not a natural number");
			System.exit(1);
		}
		
		// A sum of n natural numbers is n * (n+1) / 2 
		int sum = number * (number+1) / 2;
		
		// printing the output
		System.out.println("The sum of "+number+" natural numbers is "+ sum);
		
	}
}
