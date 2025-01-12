import java.util.*;
public class ReSumTilZero{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Taking Input of Number
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		
		int sum = 0;
		
		// using infinite while loop
		
		while(true) {
			// break statement to get outside of loop
			if (number <= 0) {
				break;
			}
			sum += number;
			System.out.print("Enter another Number or enter 0 to exit : ");
			number = input.nextInt();
		}
		System.out.println("Sum is :"+ sum);
		
	}
}
