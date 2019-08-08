package com.example;

/**
 * This is a class.
 */
public class SmellyGreeter {

  /**
   * This is a constructor.
   */
  public SmellyGreeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    String greeter_name = someone;
    String greeter_smelly_name = greeter_name;
    return String.format("Hello, %s!", greeter_smelly_name);
  }
}
