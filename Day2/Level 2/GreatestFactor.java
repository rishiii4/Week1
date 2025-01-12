import java.util.Scanner;
public class GreatestFactor{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		//Taking input of Number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int greatestFactor = 1;
        
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {    
                greatestFactor = i; 
                break; 
            }
        }
        System.out.println(greatestFactor);
        
    }
}
