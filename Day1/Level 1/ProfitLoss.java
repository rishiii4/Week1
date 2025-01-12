import java.util.*;
public class ProfitLoss{
	public static void main(String args[]){
		
		//Cost Price
		int costPrice = 129;
		
		//Selling Price
		int sellingPrice = 191;
		
		//Calculating Profit (Profit = Selling Price - Cost Price)
		float profit = sellingPrice - costPrice;
		
		//Calculating Profit Percent 
		float profitPercent = profit / costPrice * 100;
		
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		System.out.println("The Profit is INR " + profit + " and Profit Percentage is " + profitPercent );
	}	
}