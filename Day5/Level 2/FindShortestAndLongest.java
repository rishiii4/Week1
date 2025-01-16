import java.util.*;

class FindShortestAndLongest{	
	
	//Method to split in words
	public static String[] splitWords(String str){
		String string = str.trim();
		
		int count = 0; 
		 
		
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == ' '){
				count++;
			}
		}
		
		//create word array
		String word = " ";
		String [] wordArray = new String[count+1];
		int index = 0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == ' '){
				wordArray[index++] = word;
				word = "";
			}else{
				word += string.charAt(i);
			}
		}
		
		wordArray[index] = word;
		
		return wordArray;
	}	
	
	//Method to calculate string length
	public static int stringLength(String string){
		int length = 0; 
		for(int i=0;i<string.length();i++){
			length++;
		}
		return length;
	}
	
	//Method to create 2D array
	public static String[][] storeWordAndLength(String wordArray[]){
		//create 2D array which hold string and corresponding length
		String stringArray[][] = new String[wordArray.length][2];
		
		for(int i=0;i<wordArray.length;i++){
			for(int j = 0; j < 2 ; j++){
				stringArray[i][0] = wordArray[i];
				stringArray[i][1] = String.valueOf(stringLength(wordArray[i]));
			}
		}
		
		return stringArray;
	}
	// Method to find shortest and longest String
	public static String[] findShortestAndLongest(String [][] stringArray){
		
		int min = Integer.parseInt(stringArray[0][1]);// assign first index's value as minimum
		int max = Integer.parseInt(stringArray[0][1]); //  assign first index's value as maximum
		
		for(int i = 1; i < stringArray.length; i++){
			if(min >Integer.parseInt(stringArray[i][1])){
				min = Integer.parseInt(stringArray[i][1]);
			}
			if(max < Integer.parseInt(stringArray[i][1])){
				max = Integer.parseInt(stringArray[i][1]);
			}
		}
		
		// create array to store minimum and maximum array
		String [] lengthArray = new String[2];
		lengthArray[0] = String.valueOf(min); // assign minimum value to array at index 0
		lengthArray[1] = String.valueOf(max); // assign maximum value to array at index 1
		
		return lengthArray;
		
	}

		
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
		//Taking string input from user
		System.out.println("Enter string");
		String string = input.nextLine();
	
		//Call splitWords method
		String [] wordArray = splitWords(string);
		
		System.out.println("word array "+Arrays.toString(wordArray));
		int lengthOfString = stringLength(string);
		System.out.println("Length is "+lengthOfString);
		
		//call of 2D string array
		String stringArray[][] = storeWordAndLength(wordArray);
		//Display 2D array
		System.out.println("------------------------------------");
		System.out.println("Words       |  Length");
		System.out.println("------------------------------------");
		for (int i = 0; i < wordArray.length; i++) {
			//Calculate the length of each word
			int length = wordArray[i].length();
    
			//Print in tabular format using printf
			System.out.printf("%-12s|  %d%n", wordArray[i], length);
		}
		System.out.println("------------------------------------");
		String lengthArray[] = findShortestAndLongest(stringArray);
		System.out.println("Minimum string length is "+lengthArray[0]+" and Maximum String length is "+lengthArray[1]);

	} 
}