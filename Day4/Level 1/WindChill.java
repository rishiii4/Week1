import java.util.*;
public class WindChill{
	
	//Method to calculate windChill
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Taking input of temperature
        System.out.println("Enter a temperature: ");
        double temperature = input.nextDouble();

        //Taking input of Wind Speed
        System.out.println("Enter a Wind Speed: ");
        double windSpeed = input.nextDouble();

        //Printing Result
        double res = calculateWindChill(temperature, windSpeed);
        System.out.println(res);
        input.close();
    }
}
