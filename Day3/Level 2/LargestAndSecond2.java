import java.util.*;
public class LargestAndSecond2{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Taking input of a number
		System.out.println("Enter number greater than 9:");
		long number = input.nextLong();
		
		//To store number of digits
		int maxDigits = 10; 
		long tempNumber = number;

		int digits[] = new int[maxDigits];
		int index = 0;
			
		//Storing digits in array		
		while(tempNumber > 0){
			if(index == maxDigits){
				int temp[] = new int[maxDigits * 2];
				for(int i=0; i<maxDigits; i++){
					//copying array
					temp[i] = digits[i]; 
				}
				
				//pointing to new array
				digits = temp;   
			}
				
			digits[index] = (int)tempNumber%10;
			tempNumber = tempNumber / 10;
			index++;
		}
		
		//Initializing Largest and Second largest
		int largest = 0;
		int secondLargest = 0;
		
		//Finding Largest and Second Largest
		for(int i=0; i<index; i++){ 
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}
			if(digits[i] > secondLargest && digits[i] < largest){
				secondLargest = digits[i];
			}
		}

		System.out.println("Largest number is: " + largest + " and Second Largest is: " + secondLargest);

    }
}