import java.util.*;
public class NumberChecker6{

    //Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i=1;i<=number;i++) {
            if (number%i == 0) {
                count++;
            }
        }

        int factors[] = new int[count];
        int index = 0;
        for (int i=1; i<=number; i++) {
            if (number%i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    //Method to find the greatest factor
    public static int findGreatestFactor(int factors[]) {
        int largest = factors[0];
        for (int i=0;i<factors.length;i++) {
            if (factors[i] > largest) {
                largest = factors[i];
            }
        }
        return largest;
    }

    //Method to find the sum of factors
    public static int findSumOfFactors(int factors[]) {
        int sum = 0;
        for (int i=0;i<factors.length;i++) {
            sum += factors[i];
        }
        return sum;
    }

    //Method to find the product of factors
    public static int findProductOfFactors(int factors[]) {
        int product = 1;
        for (int i=0;i<factors.length;i++) {
            product *= factors[i];
        }
        return product;
    }

    //Method to find the product of cubes of factors
    public static long findProductOfCubesOfFactors(int factors[]) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    //Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i=1;i<number;i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        if(sum==number){
            return true;
        }
        return false;
    }

    //Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i=1;i<number;i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        if(sum>number){
            return true;
        }
        return false;
    }

    //Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i=1;i<number; i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        if(sum<number){
            return true;
        }
        return false;
    }

    //Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if(sum==number){
            return true;
        }
        return false;
    }

    //Helper method to calculate the factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i=1;i<=digit;i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factors[] = findFactors(number);

        //Printing Result
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

    }
}
