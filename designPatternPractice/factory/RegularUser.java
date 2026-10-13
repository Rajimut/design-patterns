package designPatternPractice.factory;

public class RegularUser implements User {
	@Override
	public String getDescription() {
		return "this is regular user";
	}
}