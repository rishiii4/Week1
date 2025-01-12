import java.util.*;
public class DiscountedFee{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Fee Amount
		System.out.println("Enter Fee Amount: ");
		int fee = input.nextInt();
		
		//Taking input of Discount Percent
		System.out.println("Enter Discount Percent: ");
		float discountPercent = input.nextFloat();
		
		//Calculating Discount
		float discount = fee * discountPercent / 100;
		
		//Calculating final Amount 
		float finalFee = fee - discount;
		
		System.out.print("The discount amount is INR "+ discount +" and final discounted fee is INR " + finalFee);
	}	
}