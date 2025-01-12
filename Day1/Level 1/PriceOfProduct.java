import java.util.*;
public class PriceOfProduct{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Price per unit
		System.out.println("Enter the per unit price of product: ");
		double pricePerUnit  = input.nextDouble();
	
		//Taking input of Quantity of product
		System.out.println("Enter the quantity of product: ");
		double quantity = input.nextDouble();
		
		double totalPrice = pricePerUnit * quantity;
		
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity "+ quantity + " and unit price is INR " + pricePerUnit);


	}	
}