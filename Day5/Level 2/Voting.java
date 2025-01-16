import java.util.*;

public class Voting{

    //Method to generate random ages for 10 students
    public static int[] generateAges(int numberOfStudents) {
        Random rand = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i=0;i<numberOfStudents;i++) {
            ages[i] = rand.nextInt(100); //Random age between 0 and 99
        }
        return ages;
    }

    //Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = Integer.toString(ages[i]);

            if (ages[i] < 0) {
                results[i][1] = "False";
            } else if (ages[i] >= 18) {
                results[i][1] = "True";
            } else {
                results[i][1] = "False";
            }
        }
        return results;
    }

    //Method to display the result in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age | Can Vote");
        System.out.println("--------------");

        for (int i=0;i<results.length;i++) {
            System.out.println(results[i][0] + "  | " + results[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Generate random ages for 10 students
        int[] ages = generateAges(10);

        //Display generated ages
        System.out.println("Generated Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();

        //Check eligibility
        String[][] results = checkVotingEligibility(ages);

        //Display the results
        displayResults(results);

    }
}

