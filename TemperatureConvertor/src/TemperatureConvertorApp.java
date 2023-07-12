
public class TemperatureConvertorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		 double c=temperatureConverter.convertFahrenheitToCelsius(68.0);
	      System.out.printf("%.2f",c);
	}

}
