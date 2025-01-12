import java.util.*;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//Taking input of a number
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int length = String.valueOf(num).length();
	
		//Declaring the array
		int array[] = new int[length];
		length--;
	
		while(num > 0) {
			array[length--] = num % 10;
				num = num / 10;
		}

		//Displaying the array
		for(length = array.length-1; length >=0; length--) {
			System.out.println(array[length]);
		}

    }
}