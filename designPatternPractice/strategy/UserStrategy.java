package designPatternPractice.strategy;

public class UserStrategy {
	private String name;
	private Transport transport;

	public UserStrategy(String name) {
		this.name = name;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public void setTransport(String transportType) {
		if (transportType == "bus") {
			setTransport(new Bus());
		} else if (transportType == "car") {
			setTransport(new Car());
		} else if (transportType == "bike") {
			setTransport(new Bike());
		} else {
			System.out.println(" tranport type not recognised");
		}
	}

	public String getName() {
		return name;
	}

	public void goToWork() {
		System.out.println(name + " is getting ready");

		if (transport == null) {
			System.out.println("transport strategy not set");
			return;
		}

		transport.commute(this);
	}
}