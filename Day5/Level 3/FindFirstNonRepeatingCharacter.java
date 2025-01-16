import java.util.*;

public class FindFirstNonRepeatingCharacter{

    //Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        //Array to store the frequency of characters
        int[] frequency = new int[256]; // ASCII characters range

        //Loop to find the frequency of characters
        for (int i=0;i<text.length();i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        //Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; //Return first non-repeating character
            }
        }

        return '\0'; //Return null character if there is no non-repeating character
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        //Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: '" + result + "'");
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }
    }
}
