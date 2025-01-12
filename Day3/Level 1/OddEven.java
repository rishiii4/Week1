import java.util.*;

public class OddEven{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Taking input a number from user
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		if(number <= 0) {
			System.out.println("Invalid Input");
			System.exit(-1);
		}

		// Array declaration
		int evenNum[] = new int[number / 2 + 1];
		int oddNum[] = new int[number / 2 + 1];

		int oddIndex = 0, evenIndex = 0;
			
		for(int i=1; i<=number; i++) {
			if(i % 2 == 0) {
				evenNum[evenIndex++] = i;
			} else {
				oddNum[oddIndex++] = i;
			}
		}

		// Printing array
		for(int i=0; i<number / 2 + 1; i++) {
			System.out.println("Even array element at " + i + " index is: " + evenNum[i]);
		}

		for(int i=0; i<number / 2 + 1; i++) {
			System.out.println("Odd array element at " + i + " index is: " + oddNum[i]);
		}
	}
}