import java.util.*;
public class TemperatureConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Temperature in Celsius
		System.out.println("Enter Temperature in Celsius: ");
		float tempInCelsius = input.nextFloat();
		
		//Converting Temperature to Fahrenheit
		float tempInFahrenheit =  (tempInCelsius * 9/5) + 32;
		
		
		System.out.println("The "+ tempInCelsius + " celsius is " + tempInFahrenheit +" fahrenheit");
	}	
}