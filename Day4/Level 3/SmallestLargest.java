import java.util.*;
public class SmallestLargest{

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

    //Method to check if a number is Duck
    public static boolean isDuck(int number) {
        int digits[] = getDigits(number);

        for (int i=0;i<digits.length;i++){
            if(digits[i] == 0){
                return true;
            }
        }
        return false;
    }
    //Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int digits[] = getDigits(number);
        int power = digits.length;
        int sum = 0;

        for (int i=0;i<digits.length;i++){
            sum += Math.pow(digits[i], power);
        }
        if(sum == number){
            return true;
        }
        return false;
    }
    //Method to find smallest and second smallest digit
    public static int[] smallestAndSecond(int digits[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0;i<digits.length;i++){
            if(smallest >digits[i]){
                secondSmallest = smallest;
                smallest = digits[i];
            }else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest,secondSmallest};
    }
    //Method to find largest and second largest digit
    public static int[] largestAndSecond(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        //Take user input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        //Calling Methods
        System.out.println("Number of Digits "+countDigits(number));

        int digits[] = getDigits(number);
        System.out.println("Digits of Array "+Arrays.toString(digits));

        System.out.println("Duck Number: "+isDuck(number));

        System.out.println("Armstrong Number: "+isArmstrong(number));

        //Printing largest and second largest
        int largest[] = largestAndSecond(digits);
        System.out.println("Largest is "+largest[0]+ " and Second Largest is "+largest[1]);

        //Printing smallest and second smallest
        int smallest[] = smallestAndSecond(digits);
        System.out.println("Smallest is "+smallest[0]+ " and Second Largest is "+smallest[1]);
        
    }
}