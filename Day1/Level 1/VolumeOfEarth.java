import java.util.*;
public class VolumeOfEarth{
	public static void main(String args[]){
		
		//Radius of Earth in KM
		int radiusInKm = 6378;
		
		//Radius of earth in Miles
		double radiusInMiles = 6378f * 1.6;
		
		//Value of pi
		float pi = 22f / 7;
		
		//Calculating Volume of Earth in KM
		double volumeInCubicKm = 4 / 3 * pi * radiusInKm * radiusInKm * radiusInKm;
		
		//Calculating Volume of Earth in Miles
		double volumeInCubicMiles = 4 / 3 * pi * radiusInMiles * radiusInMiles * radiusInMiles;
		
		//Final Output
		System.out.println("The Volume of Earth in cubic Kilometer is "+volumeInCubicKm+ " and cubic miles is " + volumeInCubicMiles);
	}	
}