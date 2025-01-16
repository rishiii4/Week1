import java.util.*;

public class StudentGrades{

    public static void main(String[] args) {
        int numberOfStudents = 5; 
        int[][] scores = generateScores(numberOfStudents);
        double[][] result = calculateTotalAveragePercentage(scores);
        String[][] grades = calculateGrades(result);

        displayScoreCard(scores, result, grades);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i=0;i<numberOfStudents;i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(81) + 20;
            }
        }
        return scores;
    }

    //Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result = new double[scores.length][4]; // 4 columns: Total, Average, Percentage, and Rounded Percentage

        for (int i=0;i<scores.length;i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = Math.round(percentage * 100.0) / 100.0; // Rounded to two decimal places
        }
        return result;
    }

    //Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] result) {
        String[][] grades = new String[result.length][1];

        for (int i=0;i<result.length;i++) {
            double percentage = result[i][3];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }

    //Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] result, String[][] grades) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student No | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i=0;i<scores.length;i++) {
            System.out.print("Student " + (i + 1) + "    | ");
            for (int j=0;j<3;j++) {
                System.out.print(scores[i][j] + "       | ");
            }
            System.out.print(result[i][0] + "    | ");
            System.out.print(String.format("%.2f", result[i][1]) + "      | ");
            System.out.print(result[i][3] + "       | ");
            System.out.println(grades[i][0]);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }
}
