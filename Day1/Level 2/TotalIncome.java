import java.util.*;
public class TotalIncome{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Salary
		System.out.println("Enter Salary: ");
		float salary = input.nextFloat();
		
		//Taking Input of Bonus
		System.out.println("Enter Bonus: ");
		float bonus =  input.nextFloat();
		
		//Calculating Total Income
		float totalIncome = salary + bonus;
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	}	
}