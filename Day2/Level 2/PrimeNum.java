import java.util.*;
public class PrimeNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {
            // If the number is divisible by any number between 2 and number
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } 
        else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
