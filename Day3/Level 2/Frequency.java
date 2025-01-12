import java.util.*;

public class Frequency{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Taking input of a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
		int frequency[] = new int[10];

		while(number > 0) {
			int num = number % 10;
			frequency[num]++;
			number = number / 10;
		}

		//Printing frequency
		for(int i=0; i<10; i++) {
			System.out.println("Frequency of " + i + " is " + + frequency[i]);
		}

	}
}