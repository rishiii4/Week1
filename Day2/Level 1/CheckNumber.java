import java.util.*;
public class CheckNumber{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		// checking if the num is positive or not by using if else ladder
		
		if (number > 0) {
			System.out.println("the number is positive");
		}
		else if (number < 0){
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
		
	}
}
