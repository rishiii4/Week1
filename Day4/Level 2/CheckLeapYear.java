import java.util.*;
public class CheckLeapYear{
	//Method to check leap year
    public static String isLeapYear(int year){
        String leapYear= "It is a Leap Year";
        String notLeapYear = "It is not a Leap Year";

        //Condition to check leap year
        if(year % 4 == 0 && year % 100 != 0){
            return  leapYear;
        }else if (year % 400 == 0){
            return leapYear;
        }
        return notLeapYear;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of Year
        System.out.println("Enter Year: ");
        int year = input.nextInt();

        String checkLeap = isLeapYear(year);
        //Printing Result
        System.out.println(checkLeap);
    }
}