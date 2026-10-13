package designPatternPractice.adaptor;

public class AdaptorClient {
	public void getTempFromApp() {
		ThirdPartyWeatherAPI thirdParty = new ThirdPartyWeatherAPI();
		WeatherAppImpl weatherApp = new WeatherAppImpl(thirdParty);
		double temp = weatherApp.getTempF();
		System.out.println("temp in F from 1st party: " + temp);
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

		AnotherThirdPartyWeatherAPI thirdParty2 = new AnotherThirdPartyWeatherAPI();
		WeatherAppImpl weatherApp2 = new WeatherAppImpl(thirdParty2);
		double temp2 = weatherApp2.getTempF();
		System.out.println("\ntemp in F from another party: " + temp2);
		if (temp2 >= 90.0) {
			System.out.println("its too hot");
		} else if (temp2 >= 80.0 && temp2 < 90.0) {
			System.out.println("its warm");
		} else if (temp2 >= 70.0 && temp2 < 80.0) {
			System.out.println("its pleasant");
		} else if (temp2 >= 60.0 && temp2 < 70.0) {
			System.out.println("its mildly cold");
		} else if (temp2 < 60.0) {
			System.out.println("its very cold");
		}
	}
}