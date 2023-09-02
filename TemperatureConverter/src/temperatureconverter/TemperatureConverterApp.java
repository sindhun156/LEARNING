package temperatureconverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		double celsius=tc.converteFahrenheitToCelsius(fahrenheit);
		System.out.println(celsius);
	}

}
