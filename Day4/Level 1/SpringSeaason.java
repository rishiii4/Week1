import java.util.*;
public class SpringSeason{
	
	//Method to check spring season
    public static boolean isSpring(int month, int day){
        if (month > 3 && month < 6) {
            return true;
        }
        // checking day
        if (month == 3 && day >= 20) {
            return true;
        }
        if (month == 6 && day <= 20) {
            return true;
        }
        return false;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking input of Month in Number
        System.out.println("Enter Month in Number: ");
        int month = sc.nextInt();

        //Taking input of Day in Number
        System.out.println("Enter Day in Number: ");
        int day = sc.nextInt();


        //Printing Result
        System.out.println(isSpring(month, day));
    }
}