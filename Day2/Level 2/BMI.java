import java.util.*;
public class BMI{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		//Taking input of weight in kilogram
        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();
        
		//Taking input of height in centimeters
        System.out.print("Enter height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert height to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Output the BMI 
        System.out.println("Your BMI is: " + bmi);
        
        // Check BMI output
        if (bmi <= 18.4) {
            System.out.println("You are underweight");
        } else if (bmi <= 24.9) {
            System.out.println("You have a normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}
