import java.util.*;
public class IllegalArgumentException{

	//Method to Generate Exception
    public static void generateException(String str){
		int startIndex = 3, endIndex = 1;
		
        System.out.println("Generating IllegalArgumentException");
        System.out.println(str.substring(startIndex,endIndex));
		
		if(startIndex>endIndex){
			throw new IllegalArgumentException();
			
		}
    }

    //Method to handle IllegalArgumentException
    public static void handleException(String str){
        try {
            System.out.println("Generating IllegalArgumentException");
            System.out.println(str.substring(3,1));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.next();

        try{
            generateException(str);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        handleException(str);
    }
}	
