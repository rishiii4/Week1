import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking input and parsing into date format
        System.out.println("Enter the first date (yyyy-MM-dd):");
        LocalDate firstDate = LocalDate.parse(input.nextLine());

        //Getting second input and parsing into date format
        System.out.println("Enter the second date (yyyy-MM-dd):");
        LocalDate secondDate = LocalDate.parse(input.nextLine());

        //Comparing conditions
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        //closing the scanner object
        input.close();
    }
}

