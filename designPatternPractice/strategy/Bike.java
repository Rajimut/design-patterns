package designPatternPractice.strategy;

public class Bike implements Transport {
	@Override
	public void commute(UserStrategy user) {
		System.out.println(user.getName() + " is commuting in bike");
	}
}