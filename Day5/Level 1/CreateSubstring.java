import java.util.*;
public class CreateSubstring{
	//Method to create substring using charAt()
    public static String toCreateSubString(String str1, int startIndex, int endIndex){
        String subStr2 = "";
        for(int i=startIndex; i<endIndex;i++){
           subStr2 += str1.charAt(i);
        }
        return subStr2;
    }
    //Method to compare the Substrings
    public static boolean toCompare(String subStr1, String subStr2){
        if(subStr1.length() != subStr2.length()){
            return false;
        }
        for(int i=0;i<subStr1.length();i++){
			if(subStr1.charAt(i) != subStr2.charAt(i)){
				return false;
			}
		}
        return true;
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Taking input of string
        System.out.println("Enter String: ");
        String str1 = input.next();
		
		//Taking input of starting index
        System.out.println("Enter Starting index: ");
        int startIndex = input.nextInt();
		
		//Taking input of ending index
        System.out.println("Enter Ending index: ");
        int endIndex = input.nextInt();
		
		//Calling Methods
        String subStr1 = str1.substring(startIndex, endIndex);
        String subStr = toCreateSubString(str1, startIndex, endIndex);
        boolean isSubStrSame = toCompare(subStr1, subStr);
		
		//Printing Result 
        System.out.println(isSubStrSame);

    }
}	
