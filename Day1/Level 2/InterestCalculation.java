import java.util.*;
public class InterestCalculation{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Principal Amount
		System.out.println("Enter Principal Amount: ");
		int principal = input.nextInt();
		
		//Taking Input of Rate of Interest
		System.out.println("Enter Rate of Interest: ");
		int rate =  input.nextInt();
		
		//Taking Input of Time 
		System.out.println("Enter Time in Years: ");
		int time =  input.nextInt();
		
		int simpleInterest = principal * rate * time / 100;
			
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}	
}