package designPatternPractice.builder;

public class Sample {
	int costPrice;
	int quantity;
	int discount;
	String name;
	String description;
	String owner;
	String category;

	public Sample(String name, int cost, int quantity, int discount) {
		this.name = name;
		this.costPrice = cost;
		this.discount = discount;
	}

	public Sample(String name, int cost, int quantity, int discount, String description) {
		this.name = name;
		this.costPrice = cost;
		this.discount = discount;
		this.description = description;
	}

	public Sample(String name, int cost, int quantity, int discount, String description, String owner, String category) {
		this.name = name;
		this.costPrice = cost;
		this.discount = discount;
		this.description = description;
		this.owner = owner;
		this.category = category;
		this.quantity = quantity;
	}

	public void printDetails() {
		System.out.println("name: " + name);
		System.out.println("cost: " + costPrice);
		System.out.println("discount: " + discount);
		System.out.println("quantity: " + quantity);
		System.out.println("description: " + description);
		System.out.println("owner: " + owner);
		System.out.println("category: " + category);
	}
}