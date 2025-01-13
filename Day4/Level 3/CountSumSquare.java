import java.util.*;
public class CountSumSquare{

	//Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    //Method to store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int digits[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //Method to calculate sum
    public static int sumOfDigits(int digits[]) {
        int sum = 0;
        for (int i=0;i<digits.length;i++) {
            sum += digits[i];
        }
        return sum;
    }

    //Method to calculate sum of squares of digits
    public static int sumOfSquares(int digits[]) {
        int sumSquare = 0;
        for (int i=0;i<digits.length;i++) {
            sumSquare += Math.pow(digits[i], 2);
        }
        return sumSquare;
    }

    //Method to check if a number is Harshad
    public static boolean isHarshad(int number) {
        int digits[] = getDigits(number);
        int sum = sumOfDigits(digits);
        if(number % sum == 0){
            return true;
        }
        return false;
    }

    //Method to find digit frequency
    public static int[][] digitFrequency(int number) {
        int digits[] = getDigits(number);
        int frequency[][] = new int[10][2];

        //Initialize the frequency array
        for (int i=0;i<10;i++) {
            frequency[i][0] = i; // Digit
            frequency[i][1] = 0; // Frequency
        }

        //Count frequency of each digit
        for (int i=0;i<digits.length;i++) {
            int digit = digits[i];
            frequency[digit][1]++; // Increment the frequency count for the current digit
        }

        return frequency;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //Take user input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        //Call methods and display results
        int digits[] = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Number of Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number));

        //Frequency of digits
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int i=0;i<10;i++) {
            if (frequency[i][1]>0) {
                System.out.println("Digit " + frequency[i][0] + "  Frequency " + frequency[i][1]);
            }
        }
    }
}