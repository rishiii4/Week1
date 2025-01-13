import java.util.*;
public class QuotientRemainder{
	
	//Method to find Quotient and Remainder
    public static int[] findRemainderAndQuotient(int num1, int num2) {

        //Array for 2 Numbers
        int output[] = new int[2];
        output[0] = num1 % num2;

        output[1] = num1 / num2;

        return output;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of numbers
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        int reminderQuotient[] = findRemainderAndQuotient(num1, num2);

        //Printing output
        System.out.println("Reminder is "+ reminderQuotient[0] + " and Quotient is "+ reminderQuotient[1]);

        input.close();

    }
}