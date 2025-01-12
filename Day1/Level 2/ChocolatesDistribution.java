import java.util.*;
public class ChocolatesDistribution{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number of Chocolates
		System.out.println("Enter Number of Chocolates: ");
		int numberOfChocolates = input.nextInt();
		
		//Taking Input of Number of Childrens
		System.out.println("Enter Number of Childrens: ");
		int numberOfChildrens =  input.nextInt();
		
		//Number of chocolates childrens getting
		int childrenGetting = numberOfChocolates / numberOfChildrens;
		
		//Remaining Chocolates
		int remainingChocolates = numberOfChocolates % numberOfChildrens;
			
		System.out.println("The number of chocolates each child gets is " + childrenGetting + " and the number of remaining chocolates are " + remainingChocolates);
	}	
}