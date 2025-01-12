import java.util.*;
public class SumOfNByFor{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Taking Input from user
		System.out.println("Enter Number: ");
		int num = input.nextInt();
		
		if (num < 1) {
			System.out.println("The number " +num+ " is not a natural number");
			System.exit(1);
		}
		
		// A sum of n natural numbers is n * (n+1) / 2 
		int sum = num * (num+1) / 2;
		
		int numTemp = num;
		int sum2 = 0;
		for (int i = numTemp; i > 0; i--) {
			sum2 += numTemp;
			numTemp--;
		}
		// checking if they are same
		if (sum == sum2) {
			System.out.println("Both are Same");
		}else {
			System.out.println("Both are not Same");
		}

		System.out.println("The sum of "+num+" natural numbers is "+ sum);
		
		input.close();
		
	}

}