import java.util.*;
public class StudentFee{
	public static void main(String args[]){
		
		//Total fee
		int fee = 125000;
		
		//Discount Percent
		int discountPercent = 10;
		
		//Calculating Discount
		int discount = fee * discountPercent / 100;
		
		//Calculating final Amount 
		int finalFee = fee - discount;
		
		System.out.print("The discount amount is INR "+ discount +" and final discounted fee is INR " + finalFee);
	}	
}