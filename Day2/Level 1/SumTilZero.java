import java.util.*;
public class SumTilZero{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking Input of Number
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		
		int sum = 0;
		
		// the sum is stored in sum variable
		
		while(number != 0) {
			sum += number;
			System.out.print("Enter another Number or enter 0 to exit : ");
			number = input.nextInt();
		}
		
		System.out.println("Sum is "+ sum);
		
	}
}
