import java.util.*;
public class UnitConverter2{

	//Method to convert Yards to Feet
    public static double convertYardsToFeet(double yards){
        double yardToFeet = yards * 3;
        return yardToFeet;
    }
    //Method to convert Feet to Yards
    public static double convertFeetToYards(double feet){
        double feetToYards = feet * 0.333333;
        return feetToYards;
    }
    //Method to convert Meters to Inches
    public static double convertMetersToInches(double meters){
        double meterToInches = meters * 39.3701;
        return meterToInches;
    }
    //Method to convert Inches to Meters
    public static double convertInchesToMeters(double inches){
        double inchesToMeters = inches * 0.0254;
        return inchesToMeters;
    }
    public static double convertInchesToCm(double inches){
        double inchesToCm = inches * 2.54;
        return inchesToCm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user to convert
        System.out.println("Enter Yards to convert to feet:");
        double yards = input.nextDouble();

        System.out.println("Enter Feet to convert to yards:");
        double feet = input.nextDouble();

        System.out.println("Enter meters to convert to inches");
        double meters = input.nextDouble();

        System.out.println("Enter inches to convert to meters:");
        double inches = input.nextDouble();

        //Printing Converted Values
        System.out.println(yards+" yards to feet is "+ convertYardsToFeet(yards));
        System.out.println(feet+" miles to Km is "+ convertFeetToYards(feet));
        System.out.println(meters+ " meters to inches is "+ convertMetersToInches(meters));
        System.out.println(inches+ " inches to meter is "+ convertInchesToMeters(inches));
        System.out.println(inches+ " inches to cm is "+convertInchesToCm(inches));
    }
}