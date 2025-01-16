import java.util.*;
public class NumberFormatException{

	//Method to Generate NumberFormatException
    public static void generateException(){

        Scanner input = new Scanner(System.in);

        //Taking input of String
        System.out.println("Enter a String: ");
        String str = input.next();

        int x = Integer.parseInt(str);
        System.out.println(x);
    }
    //Method to handle NumberFormatException
    public static void handleException(){
        try {
          generateException();
        }catch (NumberFormatException e){
            System.out.println("This will generate NumberFormatException "+e.getMessage());
        }
    }
    public static void main(String args[]){

        try {
            generateException();
        }catch (NumberFormatException e){
            handleException();
        }
    }
}	
