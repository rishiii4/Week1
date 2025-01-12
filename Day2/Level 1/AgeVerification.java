import java.util.*;
public class AgeVerification{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of age
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		
		// checking if a person can vot or not
		
		if (age < 18) {
			System.out.println("The person cannot vote.");
		}
		else {
			System.out.println("The person can vote.");
		}
		
	}
}
