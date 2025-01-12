import java.util.*;
public class NumberOfHandshakes{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		//Taking input of Number of Students
		System.out.println("Enter the Number of Students: ");
		int numberOfStudents = input.nextInt();
	
		
		//Calculating the Combination
		int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		
		System.out.println("The total Number of Possible handshakes is " + possibleHandshakes);


	}	
}