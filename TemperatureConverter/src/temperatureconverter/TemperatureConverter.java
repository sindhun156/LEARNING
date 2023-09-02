package temperatureconverter;

public class TemperatureConverter {
	public double converteFahrenheitToCelsius(double fahrenheit)
	{
		double c=(fahrenheit-32)*5/9;
		return c;
	}

}
