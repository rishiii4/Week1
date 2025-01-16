import java.util.*;
public class StringIndexOutOfBoundsException{
	//Method to Generate Exception
    public static void generateException(String str){
        int strLength = str.length();
        System.out.println(str.charAt(strLength+1));
    }
    //Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str){
        try {
            generateException(str);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.next();
        try {
            generateException(str);
        }catch (StringIndexOutOfBoundsException e){
            handleException(str);
        }

    }
}	
