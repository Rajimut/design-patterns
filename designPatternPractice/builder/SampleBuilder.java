package designPatternPractice.builder;

public class SampleBuilder {
	int costPrice;
	int quantity = 0;
	int discount = 0;
	String name;
	String description;
	String owner = "";
	String category = "";

	public SampleBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public SampleBuilder setDescription(String description) {
		this.description = description;
		return this;

	}

	public SampleBuilder setCategory(String category) {
		this.category = category;
		return this;

	}

	public SampleBuilder setOwner(String owner) {
		this.owner = owner;
		return this;

	}

	public SampleBuilder setCost(int cost) {
		this.costPrice = cost;
		return this;

	}

	public SampleBuilder setDiscount(int discount) {
		this.discount = discount;
		return this;

	}

	public SampleBuilder setQuantity(int quantity) {
		this.quantity = quantity;
		return this;

	}

	public Sample build() {
		return new Sample(name, costPrice, quantity, discount, description, owner, category);
	}

}