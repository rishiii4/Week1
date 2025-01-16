import java.util.*;
public class SplitTextSimple{	

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
	//Method to split text
	public static String[] toSplitText(String string){
		string = string.trim();
		int countWords = 0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == ' '){
				countWords++;
			}
		}
		String words[] = new String[countWords+1];
		String word = "";
		int index = 0;
		
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == ' '){
				words[index++] = word;
				word = "";
			}else{
				word += string.charAt(i);
			}
		}
		words[index] = word;
		return words;
		
	}
	
	//Method to compare if both arrays are equal
	public static boolean isEqual(String words1[], String words2[]){
		if(words1.length != words2.length){
			return false;
		}
		for(int i=0;i<words1.length;i++){
			if(!words1[i].equals(words2[i])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of String
		System.out.println("Enter a String: ");
		String string = input.nextLine();
		
		String words1[] = toSplitText(string); 
		String words2[] = string.split("\\s+"); 
		
		if(isEqual(words1, words2)){
			System.out.println("Both are Equal");
		}else{
			System.out.println("Both are not Equal");
		}
		

    }
}	