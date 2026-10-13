package designPatternPractice.factory;

public class ModeratorUser implements User {
	@Override
	public String getDescription() {
		return "this is moderator";
	}
}