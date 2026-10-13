package designPatternPractice.adaptor;

public class AnotherThirdPartyWeatherAPI implements WeatherAPI {
	Double temp;

	public void setTempC(double temp) {
		this.temp = temp;
	}

	@Override
	public double getTempC() {
		if (temp != null) {
			return temp;
		} else {
			return 35.3;
		}
	}
	
}