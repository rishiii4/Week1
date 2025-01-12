import java.util.*;

public class BMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of number of person
        System.out.println("Enter the number of person: ");
        int persons = input.nextInt();

        //Array declaration for weight and height
        double personData[][] = new double[persons][3];
        String status[] = new String[persons];

        //Taking input of height in metre
        System.out.println("Enter weight (in kg) and height (in metre) of each person: ");
        for(int i=0; i<persons; i++) {
            for(int j=0; j<2; j++) {
                personData[i][j] = input.nextDouble();
            }
        }

        //Calculating BMI
        for(int i=0; i<persons; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
        }

        //Determine the weight status
        for(int i=0; i<persons; i++) {
            String weightStatus;
            if (personData[i][2] < 18.5) {
                weightStatus = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus = "Overweight";
            } else {
                weightStatus = "Obese";
            }

            status[i] = weightStatus;
        }

        //Display the weight status
        for(int i=0; i<persons; i++) {
            System.out.println("Person's weight is " + personData[i][0] + " and height " + personData[i][1] + " m have bmi = " + personData[i][2] + " and his weight Status is " + status[i]);
        }

        input.close();
    }
}