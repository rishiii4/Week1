import java.util.*;
public class NumberChecker4{

    public static int[] getDigitsArray(int number) {
        int temp = number;
        int size = 0;

        // count the size of number
        while (temp > 0) {
            size++;
            temp /= 10;
        }

        // create array according to size
        int[] digits = new int[size];

        // store the digit in array
        for (int i= size-1;i >= 0;i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isPalindrome(int number) {
        int digits[] = getDigitsArray(number);
        int reversed[] = new int[digits.length];

        //create the reverse array
        for (int i=0;i<digits.length;i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        // Compare original and reversed array
        for (int i=0;i<digits.length;i++) {
            if (digits[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDuckNumber(int number) {
        while (number > 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 105;

        // Simple for loop for printing digits
        int digits[] = getDigitsArray(number1);
        System.out.print("Digits Array: ");
        for (int i=0;i<digits.length;i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nIs Palindrome? " + isPalindrome(number1));
        System.out.println("Is Duck Number? " + isDuckNumber(number2));
    }
}
