package temperature_conversion;
import java.util.Scanner;

public class Temperatureconversion 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter the Temperature Value: ");
	    double temperature = scn.nextDouble();
	        
	    System.out.println("Enter the unit of the Temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
	    char temperatureunit = scn.next().toUpperCase().charAt(0);
	        
	        switch (temperatureunit) 
	        {
	            case 'C':
	                convertToCelsius(temperature);
	                break;
	            case 'F':
	                convertToFahrenheit(temperature);
	                break;
	            case 'K':
	                convertToKelvin(temperature);
	                break;
	            default:
	                System.out.println("Invalid unit are Entered. \n Please Enter Valid C, F, or K.");
	        }
	 }

	    public static void convertToCelsius(double celsius) {
	        double fahrenheit = (celsius * 9/5) + 32;
	        double kelvin = celsius + 273.15;
	        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F and " + kelvin + "K.");
	    }

	    public static void convertToFahrenheit(double fahrenheit) {
	        double celsius = (fahrenheit - 32) * 5/9;
	        double kelvin = celsius + 273.15;
	        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C and " + kelvin + "K.");
	    }

	    public static void convertToKelvin(double kelvin) {
	        double celsius = kelvin - 273.15;
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(kelvin + "K is equal to " + celsius + "°C and " + fahrenheit + "°F.");
	}
}
