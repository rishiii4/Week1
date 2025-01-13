import java.util.*;
public class TrianglePerimeter{
	
	//Method to calculate the Rounds
    public static int trianglePeri(int side1, int side2, int side3){
        int sum = (side1 + side2 + side3);
        int run = 5000 / sum;
        return run;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking input of sides
        System.out.println("Enter length of side 1: ");
        int side1 = sc.nextInt();

        System.out.println("Enter length of side 2: ");
        int side2 = sc.nextInt();

        System.out.println("Enter length of side 3: ");
        int side3 = sc.nextInt();

        //Printing Result
        int res = trianglePeri(side1, side2, side3);
        System.out.println(res);
    }
}