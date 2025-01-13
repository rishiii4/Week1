import java.util.*;
public class SimpleInterest{
	
	//Method to calculate Simple Interest
	public static int SimpleInt(int principal, int rate, int time){
        int calcInt = (principal * rate * time) / 100;
        return calcInt;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		//Taking input of principal amount
        System.out.println("Enter Principal Amount: ");
        int principal = sc.nextInt();
		
		//Taking input of Rate of interest
        System.out.println("Enter Rate of Interest: ");
        int rate = sc.nextInt();
		
		//Taking input of Time 
        System.out.println("Enter Time: ");
        int time = sc.nextInt();

        int res = SimpleInt(principal, rate, time);
        System.out.println("The Interest is " + res + " for Principal "+ principal +", Rate of Interest "+ rate +" and Time "+time);
    }	
}