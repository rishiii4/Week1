import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking input of Number from user
        System.out.print("Enter a number for fizzbuzz: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            // Check for multiples of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
