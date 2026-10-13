package designPatternPractice.factory;

public class UserFactory {
	public static User create(String type) {
		if (type == "admin") {
			return new AdminUser();
		} else if(type == "moderator") {
			return new ModeratorUser();
		} else {
			return new RegularUser();
		}
	}
}