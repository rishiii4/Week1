import java.util.*;
public class UnitConverter{

	//Method to convert Km to Mile
    public static double convertKmToMiles(double km){
        double kmToMiles = km * 0.621372;
        return kmToMiles;
    }
    //Method to convert Mile to Km
    public static double convertMilesToKm(double miles){
        double milesToKm = miles * 1.60934;
        return milesToKm;
    }
    //Method to convert Meters to Feet
    public static double convertMetersToFeet(double meters){
        double meterToFeet = meters * 3.28084;
        return meterToFeet;
    }
    //Method to convert Feet to Meters
    public static double convertFeetToMeters(double feet){
        double feetToMeters = feet * 0.3048;
        return feetToMeters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user to convert
        System.out.println("Enter km to convert:");
        double km = input.nextDouble();

        System.out.println("Enter Miles to convert:");
        double miles = input.nextDouble();

        System.out.println("Enter meters to convert");
        double meters = input.nextDouble();

        System.out.println("Enter feet to convert:");
        double feet = input.nextDouble();
		
		//Printing Converted Values
        System.out.println(km+" km to Mile is "+ convertKmToMiles(km));
        System.out.println(miles+" miles to Km is "+ convertMilesToKm(miles));
        System.out.println(meters+ " meters to feet is "+ convertMetersToFeet(meters));
        System.out.println(feet+ " feet to meter is "+ convertFeetToMeters(feet));
    }
}