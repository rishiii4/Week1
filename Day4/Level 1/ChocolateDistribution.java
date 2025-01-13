import java.util.*;
public class ChocolateDistribution{
	
	//Method to find the number of chocolates students getting and remaining Chocolates
    public static int[] numOfChocolates(int chocolates, int students) {

        int choco[] = new int[2];
        int studentsGetting = chocolates / students;
        int remainingChocolates = chocolates % students;
        choco[0] = studentsGetting;
        choco[1] = remainingChocolates;

        return choco;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of numbers of chocolates and students
        System.out.println("Enter Number of chocolates:");
        int chocolates = input.nextInt();
        System.out.println("Enter Number of Students:");
        int students = input.nextInt();

        int ans[] = numOfChocolates(chocolates, students);
        System.out.println("Number of Chocolates Each Student getting is "+ ans[0] + " and number of remaining chocolates is "+ans[1]);

    }
}