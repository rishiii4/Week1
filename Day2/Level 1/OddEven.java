import java.util.*;

public class OddEven{
	public static void main(String[] args) {
	
		//Taking input of Number 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		//Checking number is Odd or Even
		for(int i=1; i<number; i++){
			if(i % 2 == 0 ){
				System.out.println(i +" is Even");
			}else{
				System.out.println(i +" is odd");
			}
		}
		
	}
}