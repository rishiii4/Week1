import java.util.*;

public class BMICalculator{

    //Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4]; //Weight, Height, BMI, Status

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; //cm to meters conversion
            double bmi = weight / (heightInMeters * heightInMeters);

            //Storing height, weight, and calculated BMI
            result[i][0] = String.format("%.2f", data[i][0]); //Weight
            result[i][1] = String.format("%.2f", data[i][1]); //Height
            result[i][2] = String.format("%.2f", bmi);        //BMI Value

            //Determining BMI Status
            if (bmi <= 18.4) {
                result[i][3] = "Underweight";
            } else if (bmi <= 24.9) {
                result[i][3] = "Normal";
            } else if (bmi <= 39.9) {
                result[i][3] = "Overweight";
            } else {
                result[i][3] = "Obese";
            }
        }
        return result;
    }

    //Method to display results in tabular format
    public static void displayResults(String[][] result) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t\t" + result[i][1]
                    + "\t\t" + result[i][2] + "\t\t" + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2]; //weight, height

        //Taking input for 10 members
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        //Calling method to calculate BMI and get results
        String[][] results = calculateBMI(data);

        //Displaying results
        displayResults(results);

        input.close();
    }

}

