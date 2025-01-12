import java.util.*;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Taking input a number from user
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
		//Array declaration
		String store[] = new String[number + 1];

		for(int i=0; i<=number; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				store[i] = "FizzBuzz";	
			} else if(i % 3 == 0) {
				store[i] = "Fizz";
			} else if(i % 5 == 0) {
				store[i] = "Buzz";
			} else store[i] = String.valueOf(i);
		}

		// Printing result
		for(int i=0; i<=number; i++) {
			System.out.println("Index: " + i + " = "+ store[i]);
		}

	}
}