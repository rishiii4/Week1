import java.util.*;
public class CheckNumber{
	
	//Method to calculate the Possible Number of Handshakes
	public static int checkNum(int num){
        if(num < 0){
			return -1;
		}else if (num > 0){
			return 1;
		}else{
			return 0;
		}
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		//Taking input of Number
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        int res = checkNum(num);
        System.out.println(res);
    }	
}