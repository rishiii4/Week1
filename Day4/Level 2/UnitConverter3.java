import java.util.*;
public class UnitConverter3{

	//Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit){
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }
    //Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius){
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }
    //Method to convert Pounds to Kg
    public static double convertPoundsToKg(double pounds){
        double poundsToKg = pounds * 0.453592;
        return poundsToKg;
    }
    //Method to convert Kg to Pounds
    public static double convertKgToPounds(double kg){
        double kgToPounds = kg * 2.20462;
        return kgToPounds;
    }
    //Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons){
        double gallonsToLiters = gallons * 3.78541;
        return gallonsToLiters;
    }
    //Method to convert Liters to Gallons
    public static double convertLitersToLiters(double liters){
        double litersToGallons = liters * 0.264172;
        return litersToGallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from user to convert
        System.out.println("Enter number convert Fahrenheit to Celsius:");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter number convert Celsius to Fahrenheit:");
        double celsius = input.nextDouble();

        System.out.println("Enter number convert Pounds to Kg:");
        double pounds = input.nextDouble();

        System.out.println("Enter number convert Kg to Pounds:");
        double kg = input.nextDouble();

        System.out.println("Enter number convert Gallons to Liters:");
        double gallons = input.nextDouble();

        System.out.println("Enter number convert Liters to Gallons:");
        double litres = input.nextDouble();

        //Printing Converted Values
        System.out.println(fahrenheit+" fahrenheit to celsius is "+ convertFahrenheitToCelsius(fahrenheit));
        System.out.println(celsius+" celsius to fahrenheit is "+ convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds+ " pounds to kg is "+ convertPoundsToKg(pounds));
        System.out.println(kg+ " kg to pounds is "+ convertKgToPounds(kg));
        System.out.println(gallons+ " gallons to liters is "+convertGallonsToLiters(gallons));
        System.out.println(litres+ " liters to gallons is "+convertLitersToLiters(litres));
    }
}