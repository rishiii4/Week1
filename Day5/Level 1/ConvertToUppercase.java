import java.util.*;
public class ConvertToUppercase{
	//Method to convert string to UpperCase
    public static String convertToUpperCase(String str){
        String strUpperCase2 = "";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                strUpperCase2 += (char)(str.charAt(i) - 32);
            }else{
                strUpperCase2 += str.charAt(i);
            }
        }
        return strUpperCase2;
    }

    //Method to compare both strings
    public static boolean toCompare(String strUpperCase, String strUpperCase2){
        if(strUpperCase.length() != strUpperCase2.length()){
            return false;
        }
        for(int i=0;i<strUpperCase.length();i++){
			if(strUpperCase.charAt(i) == strUpperCase2.charAt(i)){
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

        String strUpperCase = str.toUpperCase();

        String strUpperCase2 = convertToUpperCase(str);

        boolean compareStrings = toCompare(strUpperCase, strUpperCase2);

        System.out.println("String 1 : "+strUpperCase);
        System.out.println("String 2 : "+strUpperCase2);
        System.out.println("Similar : "+compareStrings);

    }
}