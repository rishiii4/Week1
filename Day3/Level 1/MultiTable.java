import java.util.Scanner;
public class MultiTable{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking input of number from user
        int num = input.nextInt();
		
		//Array to store multiplication value 
        int multiTable[] = new int[10];
		
		//Calculation 
        for(int i = 1;i<=multiTable.length;i++){
            multiTable[i-1] = num * i;
        }
		
		//Printing Table
        for (int i = 0; i<multiTable.length;i++){
            System.out.println(multiTable[i]);
        }

    }
}