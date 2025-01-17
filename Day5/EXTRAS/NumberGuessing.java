import  java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    //Method to generate random number
    public static int generateRandomInt(){
        Random rm = new Random();
        //Random number between 0-100
        return rm.nextInt(0,100);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = generateRandomInt();

        //Taking input of guess from user
        int guess = input.nextInt();

        //Loop to check if guess is correct
        while(true) {
            if(guess == randomNumber){
                System.out.println("Correct");
                break;
            }

            if (guess > randomNumber) {
                System.out.println("High");
            } else {
                System.out.println("Low");
            }
            guess = input.nextInt();
        }
    }
}
