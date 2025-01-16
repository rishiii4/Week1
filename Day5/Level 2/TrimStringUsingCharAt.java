import java.util.*;
public class TrimStringUsingCharAt{

    //Method to trim leading and trailing spaces
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        //Remove leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        //Remove trailing spaces
        while (end > start && str.charAt(end) == ' ') {
            end--;
        }

        //Return start and end indexes
        return new int[]{start, end};
    }

    //Method to create a substring using charAt
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i=start;i<=end;i++) {
            result += str.charAt(i);
        }
        return result;
    }

    //Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i=0;i<str1.length();i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		
        String input = "    Hello World   ";
        System.out.println("Original String: '" + input + "'");

        //Trim spaces using custom method
        int[] trimmedIndexes = trimSpaces(input);
        String trimmedString = customSubstring(input, trimmedIndexes[0], trimmedIndexes[1]);
        System.out.println("Trimmed using custom method: '" + trimmedString + "'");

        //Trim spaces using built-in trim()
        String builtInTrimmed = input.trim();
        System.out.println("Trimmed using built-in trim(): '" + builtInTrimmed + "'");

        //Compare both results
        boolean isEqual = compareStrings(trimmedString, builtInTrimmed);
        System.out.println("Are both results same? " + isEqual);
    }
}
