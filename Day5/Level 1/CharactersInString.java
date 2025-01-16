import java.util.*;
public class CharactersInString{

	//Method to return the characters without toCharArray()
    public static char[] findCharacters(String str){
        char charArr[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
    //Method to compare arrays
    public static boolean toCompare(char charArr[], char charArr2[]){
        if(charArr.length != charArr2.length){
            return false;
        }
        for (int i=0;i<charArr.length;i++){
            if (charArr[i] == charArr2[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.next();

        char charArr2[] = str.toCharArray();

        char charArr[] = findCharacters(str);
		
		//Printing Result
        boolean isSimilar = toCompare(charArr, charArr2);
        System.out.println("First Array: "+ Arrays.toString(charArr));
        System.out.println("Second Array: "+ Arrays.toString(charArr2));
        System.out.println("Similar: "+isSimilar);
    }
}