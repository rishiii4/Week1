import java.util.*;
public class CountDown{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of number
		System.out.print("Enter Number to Count Down: ");
		int number = input.nextInt();
		
		while(number >= 1){
			System.out.println(number);
			number --;
		}
		
	}
}