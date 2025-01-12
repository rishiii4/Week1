import java.util.*;
public class  DayOfWeek{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Taking input of Month
		System.out.println("Enter 1 for January, 2 for February, and so forth:");
		int m = input.nextInt();
		
		//Taking input of Year
		System.out.println("Enter Year:");
		int y = input.nextInt();
		
		//Taking input of Day
		System.out.println("Enter Day:");
		int d = input.nextInt();
		
		int y0 = y - (14 - m) / 12;
		
		int x = y0 + y0/4 - y0/100 + y0/400;
		
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		
		int dayOfWeek = (d + x + 31 * m0 / 12) % 7;
		
		System.out.println(dayOfWeek);
	}
}