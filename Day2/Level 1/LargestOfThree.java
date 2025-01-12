import java.util.*;

public class LargestOfThree{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of Numbers
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// checking if number1 is smaller than num2 and num3 
		if (number1 < number2 && number1 < number3) {
			System.out.println("Is the first number the largest? Yes");
		}
		else {
			System.out.println("Is the first number the Largest? No");
		}
		
		// similarly we can check for num2 and num3
		if (number2 < number1 && number2 < number3) {
			System.out.println("Is the second number the largest? Yes");
		}
		else {
			System.out.println("Is the second number the Largest? No");
		}
		if (number3 < number1 && number3 < number2) {
			System.out.println("Is the third number the largest? Yes");
		}
		else {
			System.out.println("Is the third number the Largest? No");
		}
		
	}
}
