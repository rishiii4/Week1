import java.util.Scanner;
public class ComparingNumbers{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number[] = new int[5];

        for(int i=0;i<number.length;i++){
            number[i] = input.nextInt();
        }
		//Checking if Numbers are Positive, Negative or Zero
		for(int i=0;i<number.length;i++){
            if(number[i] > 0){
                System.out.println(number[i] +" is Positive");
				
				//Checking if Numbers are Odd or Even
                if(number[i] % 2 == 0){
                    System.out.println(number[i] +" is Even");
                }
                else {
                    System.out.println(number[i] +" is Odd");
                }
				
            } else if (number[i] < 0) {
                System.out.println(number[i] +" is negative");
            }else {
                System.out.println("Invalid Number");
            }
        }
		
		//Checking if they are equal or not
        if(number[0] == number[4]){
            System.out.println("They are equal");
        }else{
            System.out.println("They are greater or less");
        }
		
    }
}