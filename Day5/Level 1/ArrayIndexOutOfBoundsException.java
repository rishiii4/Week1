import java.util.*;
public class ArrayIndexOutOfBoundsException{

	//Method to Generate Exception
    public static void generateException(String names[], int countOfArray){

        System.out.println("This will generate ArrayIndexOutOfBoundsException");
        System.out.println(names.length+2);
    }

    //Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String names[], int countOfArray){
        try {
            System.out.println("Generating ArrayIndexOutOfBoundsException");
            System.out.println(names.length+2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Names you want to Enter: ");
        int countOfArray = input.nextInt();

        //Creating Array of String of Names
        String names[] = new String[countOfArray];

        //Taking input of String
        System.out.println("Enter Names: ");
        for(int i=0;i<names.length;i++){
            names[i] = input.nextLine();

        }
        input.nextLine();

        try{
            generateException(names, countOfArray);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        handleException(names, countOfArray);
    }    
}	
