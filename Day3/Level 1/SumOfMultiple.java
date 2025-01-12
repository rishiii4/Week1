import java.util.*;

public class SumOfMultiple{
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Initializing array of size 10
        int arr[] = new int[10];
		int index = 0;
		
		//To calculate the total
		double total = 0.0;
		
		while(true){
			System.out.println("Enter a number:");
			int num = input.nextInt();
			if(num <= 0 || index >= arr.length){
				break;
			}
			arr[index] = num;
			index++;
		}
		
		for(int i = 0; i<arr.length; i++){
			total += arr[i];
		}
		System.out.println(total);
    }
}