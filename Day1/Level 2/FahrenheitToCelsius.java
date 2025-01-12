import java.util.*;
public class FahrenheitToCelsius{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Taking input of Temperature in fahrenheit
		System.out.println("Enter Temperature in Fahrenheit: ");
		float tempInFahrenheit = input.nextFloat();
		
		//Convertinb Temperature to Fahrenheit
		float tempInCelsius =  (tempInFahrenheit - 32) * 5/9;
		
		
		System.out.println("The "+ tempInFahrenheit + " Fahrenheit is " + tempInCelsius +" Celsius");
	}	
}