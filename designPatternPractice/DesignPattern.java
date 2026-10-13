package designPatternPractice;
import designPatternPractice.builder.Sample;
import designPatternPractice.builder.SampleBuilder;
import designPatternPractice.factory.User;
import designPatternPractice.factory.UserFactory;	
import designPatternPractice.strategy.UserStrategy;
import designPatternPractice.adaptor.AdaptorClient;


public class DesignPattern {
	// used to implement various design patterns like 
	// - singleton, builder, factory
	public void implementCreationalPattern() {
		implementSingletonPattern();
		implementBuilderPattern();
		implementFactoryPattern();
	}

	public void implementStructuralPattern() {
		implementFacadePattern();
		implementAdaptorPattern();
		implementProxyPattern();
		implementDecoratorPattern();
		implementBridgePattern();
	}

	public void implementBehavioralPattern() {
		implementStrategyPattern();
		implementObserverPattern();
		implementCommandPattern();
		implementVisitorPattern();
	}
	
	public void implementBridgePattern() {
		// used when two or independent entities exist and each can evolve by themselves
		// example have device - types radio tv etc have standard methods
		// have remote controls - abstract remote control and adv remote controls
		// these two entities can be paried by the client
		// different from adaptor pattern
		// adaptor for brownfield development and bridge for green field development
		// adaptor for two different interfaces integration
		// two differnt hierarchy and their relationship with their eveloving nature

		// pros: independent pairing by the client, open close principle, reduces no of subclasses by preventing cartesion pdt of the two
		// cons: not much   
	}

	public void implementVisitorPattern() {
		// used in places where operations needs to be isolated from the objects
		// example objects can be books electronbic etc types of products 
		// operations can be calculating shipping taxes etc
		// to add a new operation is easy (adding a new object is difficult)
		// should be used with caution, can cause a lot of compile time errors while adding new objects
		// contains accept method in objects which then calls the visit method in the visitor
		// its called double dispatch
		// example for each item in the cart call the accept method and pass a ShippingCalcVisitor
		// at the end get the total shipping cost from the visitor

		// pros: open close principle, less changes on the existing code, seperation of objects and business operations
		// cons: adding new objects becomes difficult since visitors are righly couple to the object types, lots of classes
		// cons: confusing for readers because of double dispatch
	}


	public void implementCommandPattern() {
		// used for double encapsulation
		// called as producer consumer pattern
		// there is a reciever - final excecution of the method, a command interface and its different commands that are implementing an interface
		// an invoker that distributes different command and logs the commands sent
		// end client who inokes the invoker
		// reviever, its methods, arguements are all isolated from the consumer

		// pros: encapsulation, open close principle - adding a new operation doesn't require touching old code
		// cons: elaborate n add more classes
	}

	public void implementDecoratorPattern() {
		// used to avoid multiple layers of inheritence  
		// gives more flexiblity than inheritance - prefer composition over inheritance 
		// static or dynamic addition of responsblites to the object
		// kind of recurssion
		// interface that has basic methods like get cost or get description
		// simple class that implements the interface 
		// abstract decorator class that implement the interface and that also has interface class as a memeber, initialized in the constructor
		// decorator abstract class has the same methods that returns interface impl 's cost and description
		// first decorator that extends abstract decorator, has constructor with interface as input and send to super for the initialization
		// the get description has super.get description + its own description
		// the get cost will also have super.get cost + its own cost
		
		// pros: open close principle, clean code, no need to touch the existing code, prevents many small classes doing multiple levels of inheritence
		// cons: difficult to understand

	}

	public void implementProxyPattern() {
		// used when you need to perform some checks before or after the man actvty
		// used to hide the original implementation from the client
		// used for caching of data using HashMap
		// used for preventing calls to banned sites etc
		// should implement the same interface as the original class to disguise as the original class
	}



	public void implementObserverPattern() {
		// used in cases where we want to trigger a set of activities after an event
		// example publsh a video
		// subscribers get notified
		// the VideoChannel class contains upload video method, the upload s done and notify method s called. 
		// Notify method inturn calls the subcrber's update method.
	}

	public void implementStrategyPattern() {
		// used in places where there are multiple ways of doing the job
		// example go to work via walk, bus or car
		// Different strategy to acompolish the same goal(going to work)
		// regular way (if (transporation type == walk {do this) else if (transportation type = car) {do this})
		// with Strategy pattern - create interface called TransporationStrategy with method transport
		// class car strategy implements transporataion strategy (has transport method)
		// class bike strategy implements transportation strategy (has transport method)
		// go to commpute class and have setTransportationStrategy(gets the transportation type) and sets strategy to appropriate Transporation strategy type
		// in go to work method execute the this.strategy.transport()
		// on client side -n create Commuter object and setStrategy(bike or car).goToWork();

		// pros: no need to touch the old code to add new strategy, open close principle, cleaner code
		// cons: more classes 

    	UserStrategy user = new UserStrategy("Kate");
		user.setTransport("car");
		user.goToWork();

		// 
    	UserStrategy user2 = new UserStrategy("Nate");
		user2.setTransport("bus");
		user2.goToWork();

		UserStrategy user3 = new UserStrategy("Rita");
		user3.setTransport("bike");
		user3.goToWork();

	}

	public void implementAdaptorPattern() {
		// if there is a conversion from one type to another - don't do it on the implementation or the client side
		// do it inside the adapter and client can use the adaptor to get the expected results
		// WeatherAPI interface; ThirdPartyAPI implements WeatherAPI { getTempC(){}; getDistKM(){};}
		// WeatherApp interface WeatherAdapter implements WeatherApp { getTempF(){weatherAPI.getTempC * 9/5 + 32}; getDistM(){} }
		// constructor WeatherAdapter(WeatherAPI weatherAPI) this.weatherAPI = weatherAPI;
		// client - create weatherAdaptor = new WeatherAdaptor(new ThirdPartyAPI()); weatherAdaptor.getTempF();
		// pros: decoupling
		// cons: nothing really

		AdaptorClient ac = new AdaptorClient();
		ac.getTempFromApp();

	}

	public void implementFacadePattern() {
		// like facatory used to hide the complexities
		// factory is for creation of objects, facade is for the interaction of these objects
		// example checkout button - this implements ckeacking for fraud, checking for inventory, checking for shipping, reserve inventory and process payment
		// this whole chain of events could be written inside OrderFacade and use a method called placeOrder inside facade to hide all this
		// used when there are mutiple checks and when multiple subsystems are involved
		// 
		// pros: hides the complexities and neat interface to client
		// cons: god object
		// examples: List (hides resizes etc) and many other Objects used everyday

	}

	// 
	public void implementSingletonPattern() {
		// used when you need dont need multiple instance of the same class in different places
		// examples - Logger, DBConnection etc
		// if we are writting logs to the file, we don't want mutiple logger objects writt9ing to the same file
		// we can use the same instance everywhere
		// eg Logger.getInstance() (like a glorified global variable)
		
		// pros: 
		// cons: can cause race conditions in muti thread env - needs spl handling
		// Logger logger = Logger.getInstance();
		// logger.error("jhgjhg");
	}

	public void implementBuilderPattern() {
		// used when we have a lot of optional parameters to a constructor 
		// create a new class called builder class and have same set of params with a default value set.
		// create setter methods for those params and return the the builder obj (this)
		// cvreate a method called build that sets these params to the actual obj from actual class using the old constructor
		// the client doesn't have to know the order of the params instead use the setter methods of the builder class

		// pros: cleaner code, easy to understand, scalable
		// cons: more lines of code, tight coupling between the class n its builder
		Sample sample = new SampleBuilder()
							.setName("rice flour")
							.setCost(5)
							.setDescription("flour made from rice")
							.setCategory("Food")
							.setQuantity(5)
							.build();
		sample.printDetails();

	}

	public void implementFactoryPattern() {
		// used in cases where there are different types of the same obj
		// eg User has AdminUser, Moderator, RegularUser etc
		// if you are creating these types of user objects by their type and using if else then factory pattern can be applied
		// create factory class and in a create method use the type and create the corresponding UserType objects
		// return the User object

		// pros: cleaner code for the client, all messey logic sits inside the factory
		// cons: tight coupling of class and its factory, but flexiblity is returned by using factory

		User user1 = UserFactory.create("admin");
		String output = user1.getDescription();
		System.out.println(output);

		User user2 = UserFactory.create("moderator");
		output = user2.getDescription();
		System.out.println(output);

		User user3 = UserFactory.create("anyUser");
		output = user3.getDescription();
		System.out.println(output);
	}

}