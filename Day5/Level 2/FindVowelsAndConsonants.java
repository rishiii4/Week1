import java.util.*;
public class FindVowelsAndConsonants{
	//Method to check if character of string is Vowel or Consonant
    public static void checkVowelsConsonant(String string){
        String strLowerCase = "";
        //Loop to Convert character to Lower Case
        for(int i=0; i<string.length();i++){
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                strLowerCase += (char)(string.charAt(i) + 32);
            }else{
                strLowerCase += string.charAt(i);
            }
        }
        //Loop to check if character of string is Vowel or Consonant
        for (int i=0;i<strLowerCase.length();i++){
            char ch = strLowerCase.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print("Vowel ");
            }else if(ch == ' '){
                continue;
            }else {
                System.out.print("Consonant ");
            }
        }
        System.out.println();

    }
    //Method to check if character of string is Vowel or Consonant using CharAt()
    public static int[] countVowelsConsonants(String string){
        string = string.toLowerCase();
        int countVowels = 0;
        int countConsonants = 0;
        //Loop to check if character is Vowel or Consonant
        for (int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowels++;
            }else if(ch == ' '){
                continue;
            }else{
                countConsonants++;
            }
        }
        return new int[] {countVowels, countConsonants};

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of String from User
        System.out.println("Enter a String:");
        String string = input.nextLine();

        checkVowelsConsonant(string);
        int count[] = countVowelsConsonants(string);
        System.out.println("Number of Vowels: "+count[0]+ " and Number of Consonants: "+count[1]);

    }
}