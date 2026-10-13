package designPatternPractice.strategy;

public class Car implements Transport {
	@Override
	public void commute(UserStrategy user) {
		System.out.println(user.getName() + " is commuting in car");
	}
}