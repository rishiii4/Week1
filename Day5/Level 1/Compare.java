import java.util.*;
public class Compare{
	//Method to compare result
	public static boolean toCompare(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}	
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		//Taking input of string
		System.out.println("Enter 1st String: ");
		String str1 = input.next();
		System.out.println("Enter 2nd String: ");
		String str2 = input.next();
			
		
		boolean toCompare1 = str1.equals(str2);
		boolean toCompare2 = toCompare(str1, str2);
		
		if(toCompare1 == true && toCompare2 == true){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same");
		}
	}
}	
