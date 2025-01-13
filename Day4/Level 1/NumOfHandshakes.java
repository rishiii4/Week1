import java.util.*;
public class NumOfHandshakes{
	
	//Method to calculate the Possible Number of Handshakes
	public static int possibleHandshakes(int numOfStudents){
        int combination = (numOfStudents * (numOfStudents - 1)) / 2;
        return combination;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		//Taking input of Number of Students
        System.out.println("Enter the Number of Students: ");
        int numOfStudents = sc.nextInt();
        
        int res = possibleHandshakes(numOfStudents);
        System.out.println("Possible Handshakes "+res);
    }	
}