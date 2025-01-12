import java.util.*;

public class LargestOfArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//Taking input of a number
		System.out.println("Declare the size of array: ");
		int size = input.nextInt();
	
		// Declaring the array
		int[] array = new int[size];
	
		//Taking input of elements of array
		for(int i=0; i<size; i++) { 
			array[i] = input.nextInt();
		}

		int largest = 0, secondLargest = 0;

		// Finding largest number
		for(int i=0; i<size; i++) {
			if(largest < array[i]){
				largest = array[i];
			}	
		}

		// Finding the second largest number
		for(int i=0; i<size; i++) {
			if(secondLargest < array[i] && array[i] != largest){
				secondLargest = array[i];
			}	
		}
        
		System.out.println("Largest is " + largest + " and second largest is: " + secondLargest);
    }
}