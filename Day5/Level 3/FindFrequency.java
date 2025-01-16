import java.util.*;

public class FindFrequency{

    //Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        String unique = "";

        for (int i=0;i<text.length();i++) {
            char currChar = text.charAt(i);
            if(unique.indexOf(String.valueOf(currChar)) == -1) {
                unique += (currChar);
            }
        }

        return unique.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] characterFrequency(String text) {
        int frequency[] = new int[256]; // Array to store frequency using ASCII values

        //Calculate frequency of each character
        for (int i=0;i<text.length();i++) {
            frequency[text.charAt(i)]++;
        }

        //Get unique characters
        char uniqueChars[] = uniqueCharacters(text);

        //Create 2D array to store unique characters and their frequencies
        String result[][] = new String[uniqueChars.length][2];

        for (int i=0;i<uniqueChars.length;i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        //Get character frequencies
        String frequencies[][] = characterFrequency(input);

        //Display the result
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (int i=0;i<frequencies.length;i++) {
            System.out.println(frequencies[i][0] + " | " + frequencies[i][1]);
        }

    }

}

