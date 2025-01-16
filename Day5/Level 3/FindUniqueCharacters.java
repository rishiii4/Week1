import java.util.*;

public class FindUniqueCharacters{

    //Method to calculate string length
    public static int stringLength(String string){
        int length = 0;
        for(int i=0;i<string.length();i++){
            length++;
        }
        return length;
    }
    //Method to find Unique Characters
    public static String[] findUniqueCharacters(String string, int length){
        String uniqueString[] = new String[length];
        int index = 0;

        //Loop to find Unique Characters
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            boolean isUnique = true;
            //If the character is already in the uniqueString
            for (int j=0;j<string.length();j++){
                if(uniqueString[j] != null && uniqueString[j].equals(String.valueOf(ch))){
                    isUnique = false;
                    break;
                }
            }
            //If character is unique, store it in uniqueString
            if (ch == ' '){
                continue;
            }
            else if(isUnique){
                uniqueString[index] = String.valueOf(ch);
                index++;
            }
        }
        String result[] = new String[index];
        System.arraycopy(uniqueString, 0, result, 0, index);

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of String
        System.out.println("Enter a String:");
        String string = input.nextLine();
        
        //Calling stringLength Method
        int stringLength = stringLength(string);

        //Calling findUniqueCharacters Method
        String uniqueString[] = findUniqueCharacters(string, stringLength);
        //Printing Output
        System.out.println(Arrays.toString(uniqueString));

    }

}

