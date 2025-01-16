import java.util.*;
public class NullPointer{
	//Method to Generate Exception
    public static void generateException(){
        String text = null;
        System.out.println(text.length());
    }
    //Method to Handle Exception
    public static void handleException(){
        String text = null;
        try {
            System.out.println(text.length());
        }
        catch (NullPointerException e){
            System.out.println("This will throw a Nullpointer Exception\n"+ e.getMessage());
        }
    }
    public static void main(String args[]){
        //calling generate exception
        try {
            generateException();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        handleException();

    }
}	
