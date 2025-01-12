import java.util.*;

public class Factors{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of number
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int maxFactor = 10;
		// creating array to store factors
		int factors[] = new int[maxFactor];
		int factorsIdx = 0;
		
		
		// calculating the factors of given number
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				factors[factorsIdx++] = i;
			}
			if (factorsIdx == maxFactor) {
				int tempArr[] = new int[maxFactor*2];
				for (int j = 0; j < maxFactor; j++) {
					tempArr[j] = factors[j];
				}
				factors = tempArr;
				maxFactor = maxFactor*2;
			}
		}
		
		// printing factors
		for (int i = 0; i < maxFactor; i++) {
			System.out.println(factors[i]);
		}
		
	}
}