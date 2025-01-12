import java.util.*;

public class MultiToSingle{
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input a number
        System.out.println("Enter number of rows and column: ");
        int row = input.nextInt();
        int column = input.nextInt();

        // 2D array declaration
        int twoDArr[][] = new int[row][column];
        System.out.println("Enter all elemens of array: ");

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                twoDArr[i][j] = input.nextInt();
            }
        }

        // 1D array declaration
        int array[] = new int[row * column];
        int index = 0;

        // Assigning the 2D elements to the 1D array
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                array[index] = twoDArr[i][j];
                index  +=1;
            }
        }

        // Printing 1D array
        for(int i=0; i<row*column; i++) {
            System.out.println(array[i]);
        }
    }
}