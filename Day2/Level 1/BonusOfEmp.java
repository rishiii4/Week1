import java.util.*;

public class BonusOfEmp{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of salary
		System.out.println("Enter the Salary: ");
		int salary = input.nextInt();
		
		//Taking input of Year
		System.out.println("Enter the year: ");
		int year = input.nextInt();

		
		if(year >= 5){
			double bonus = (salary * 5.0/100.0);
			System.out.println("Bonus is "+ bonus);
		}else{
			System.out.println("Bonus is Zero");
		}
		
	}
}