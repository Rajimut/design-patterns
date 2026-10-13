package designPatternPractice.adaptor;

public class AdaptorClient {
	public void getTempFromApp() {
		ThirdPartyWeatherAPI thirdParty = new ThirdPartyWeatherAPI();
		
		// should come from rd party, set temporarily for testing purposes
		thirdParty.setTempC(30.0);

		WeatherAppImpl weatherApp = new WeatherAppImpl(thirdParty);
		double temp = weatherApp.getTempF();
		System.out.println("temp in F: " + temp);
		if (temp >= 90.0) {
			System.out.println("its too hot");
		} else if (temp >= 80.0 && temp < 90.0) {
			System.out.println("its warm");
		} else if (temp >= 70.0 && temp < 80.0) {
			System.out.println("its pleasant");
		} else if (temp >= 60.0 && temp < 70.0) {
			System.out.println("its mildly cold");
		} else if (temp < 60.0) {
			System.out.println("its very cold");
		}
	}
}