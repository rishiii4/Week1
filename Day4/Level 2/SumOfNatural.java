import java.util.*;
public class SumOfNatural{
	//Method to calculate the sum of N Natural Number using Recursion
    public static int sumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        int sum = number + sumUsingRecursion(number-1);
        return sum;
    }

    //Method to calculate the sum of N Natural Number using Formula
    public static int sumUsingFormula(int number) {
        int sumFor = (number * (number+1)) / 2;
        return sumFor;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of Number from user
        System.out.println("Enter the Number: ");
        int number = input.nextInt();

        int sumRecursion = sumUsingRecursion(number);
        int sumFormula = sumUsingFormula(number);

        //Comparing Both Results
        if (sumRecursion == sumFormula){
            System.out.println("They are Same "+sumFormula);
        }
    }
}