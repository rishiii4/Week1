import java.util.*;
public class FindLength{	

	//Method to find the length of String
	public static int findLength(String string){
		int count = 0;
		try{
			while(true){
				string.charAt(count);
				count++;
			}	
		}catch(RuntimeException e){
			return count;
		}
			
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of String
		System.out.println("Enter a String: ");
		String string = input.nextLine();
		
		int stringLength1 = findLength(string);
		
		int stringLength2 = string.length();
		
		System.out.println("Length using user defined method: "+ stringLength1);
		System.out.println("Length using built-in method: "+ stringLength2);

    }
}	