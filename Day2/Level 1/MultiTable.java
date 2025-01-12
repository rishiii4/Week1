import java.util.*;

public class MultiTable{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of Number
		System.out.println("Enter Number from 6 to 9: ");
		int number = input.nextInt();
		
		if(number >= 6 || number <= 9){
			for(int i = 1; i<=10; i++){
				System.out.println(i*number);
			}	
		}else{
				System.out.println("Invalid Number");
		}
		
	}
}