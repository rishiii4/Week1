import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of number from user
        int num = input.nextInt();

        //Array to store multiplication value
        int multiple[] = new int[4];

        //Calculation
        for(int i = 6;i<=9;i++){
            multiple[i-6] = num * i;
        }

        //Printing Table
        for (int i = 0; i< multiple.length;i++){
            System.out.println(multiple[i]);
        }

    }
}