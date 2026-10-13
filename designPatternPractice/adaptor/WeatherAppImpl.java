package designPatternPractice.adaptor;

public class WeatherAppImpl implements WeatherApp {
	WeatherAPI weatherAPI;

	public WeatherAppImpl(WeatherAPI weatherAPI) {
		this.weatherAPI = weatherAPI;
	}

	@Override
	public double getTempF() {
		double tempC = weatherAPI.getTempC();
		return (tempC * 9/5) + 32.0;
	}
}