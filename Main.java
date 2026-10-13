import designPatternPractice.DesignPattern;

public class Main {
    
  public static void main(String args[]) throws Exception {
    System.out.println("Hello, World!");
    implementDesignPatterns();
  }

  public static void implementDesignPatterns() {
    implementBuilderPattern();
    implementFactoryPattern();
    implementStrategyPattern();
    implementAdaptorPattern();
  }

  public static void implementStrategyPattern() {
    System.out.println("\nImplementing strategy pattern: ");
    DesignPattern designPattern = new DesignPattern();
    designPattern.implementStrategyPattern();
  }

  private static void implementBuilderPattern() {
    System.out.println("\nImplementing builder pattern: ");
    DesignPattern designPattern = new DesignPattern();
    designPattern.implementBuilderPattern();
  }

  private static void implementFactoryPattern() {
    System.out.println("\nImplementing factory pattern: ");
    DesignPattern designPattern = new DesignPattern();
    designPattern.implementFactoryPattern();
  }

  private static void implementAdaptorPattern() {
    System.out.println("\nImplementing adaptor pattern: ");
    DesignPattern designPattern = new DesignPattern();
    designPattern.implementAdaptorPattern();
  }

}