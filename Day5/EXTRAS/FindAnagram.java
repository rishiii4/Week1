import java.util.*;

public class FindAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of two strings
        System.out.println("Enter 1st String:");
        String str1 = input.nextLine();
        System.out.println("Enter 2nd String:");
        String str2 = input.nextLine();

        char[] str1Arr = str1.toCharArray();

        char[] str2Arr = str2.toCharArray();

        //Sorting strings
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        //Display Result by comparing sorted string
        System.out.println(Arrays.equals(str1Arr, str2Arr));
    }
}
