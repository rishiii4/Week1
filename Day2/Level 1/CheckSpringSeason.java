import java.util.*;
public class CheckSpringSeason{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of month and day
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter day: ");
		int day = input.nextInt();
		
		// checking month
		if (month > 3 && month < 6) {
			System.out.println("Its a Spring Season");
		}else if (month == 3 && day >= 20) {
			System.out.println("Its a Spring Season");
		}else if (month == 6 && day <= 20) {
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Not a Spring Season");
		}
		
	}
}
