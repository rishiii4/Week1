import java.util.*;
public class ConvertToLowercase{
	//Method to convert string to LowerCase
    public static String convertToLowerCase(String str){
        String strLowerCase2 = "";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                strLowerCase2 += (char)(str.charAt(i) + 32);
            }else{
                strLowerCase2 += str.charAt(i);
            }
        }
        return strLowerCase2;
    }

    //Method to compare both strings
    public static boolean toCompare(String strLowerCase, String strLowerCase2){
        if(strLowerCase.length() != strLowerCase2.length()){
            return false;
        }
		for(int i=0;i<strLowerCase.length();i++){
			if(strLowerCase.charAt(i) == strLowerCase2.charAt(i)){
				return true;
			}
        }
        
        return false;
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.nextLine();

        String strLowerCase = str.toLowerCase();

        String strLowerCase2 = convertToLowerCase(str);

        boolean compareStrings = toCompare(strLowerCase, strLowerCase2);

        System.out.println("String 1 : "+strLowerCase);
        System.out.println("String 2 : "+strLowerCase2);
        System.out.println("Similar : "+compareStrings);

    }
}