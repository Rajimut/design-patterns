package designPatternPractice.factory;

public class AdminUser implements User {
	@Override
	public String getDescription() {
		return "this is admin";
	}
}