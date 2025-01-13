import java.util.*;
public class CheckPositiveEven{

	//Method to check if number is even or not
    public static boolean isEven(int num){
        if(num % 2==0){
            return true;
        }
        return false;
    }
    //Method to check if number is positive or not
    public static boolean isPositive(int num){
        if(num > 0){
            return true;
        }
        return false;
    }
    //Method to compare first and last element
    public static int compare(int num1, int num2){
        if(num1 > num2){
            return 1;
        }else if (num2 > num1){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];

        //Taking input of numbers
        System.out.println("Enter Numbers: ");
        for (int i=0; i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        //Checking if Number is Positive or Not
        for (int i = 0; i<numbers.length;i++){
            if(isPositive(numbers[i])){
                //Checking if Number is Even or Odd
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i]+" is Positive and Even.");
                } else {
                    System.out.println(numbers[i]+" is Positive and Odd.");
                }
            }else{
                System.out.println(numbers[i]+" is Negative");
            }
        }
        //Comparing first and last element of array
        int compareRes = compare(numbers[0], numbers[numbers.length-1] );
        if(compareRes == 0){
            System.out.println("First and Last Elements are Equal");
        }else if (compareRes == 1){
            System.out.println("First Element is Greater than Last");
        }else {
            System.out.println("Last Element is Greater than First");
        }

    }
}