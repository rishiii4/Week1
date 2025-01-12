import java.util.Scanner;
public class MultipleOfNum{
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
		//Taking input of number from user
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        

        System.out.println("Multiples of " + number + " below 100 are:");

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

    }
}