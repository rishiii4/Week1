import java.util.*;
public class SwitchCalculator{
	public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //Taking input of 1st Number
        System.out.println("Enter 1st Number: ");
        double number1 = input.nextDouble();

        //Taking input of 2nd Number
        System.out.println("Enter 2nd Number: ");
        double number2 = input.nextDouble();

        //Taking input of operation to be performed
        System.out.println("Enter Operation (+,-,*, or /: ");
        char op = input.next().charAt(0);

        switch(op) {
            case '+' :
                System.out.println("Sum of the given two numbers: "+(number1 + number2));
                break;
            case '-' :
                System.out.println("Difference between the two numbers: "+(number1 - number2));
                break;
            case '*' :
                System.out.println("Product of the two numbers: "+(number1 * number2));
            case '/' :
                System.out.println("Result of the division: "+(number1 / number2));
                break;
            default :
                System.out.println("Invalid Number/Operation");
        }
	}	
}