package com.example;

/**
 * This is a class.
 */
public class SmellyGreeter {

  /**
   * This is a constructor.
   */
  public SmellyGreeter() {
    // This is empty

  }

  public String greet(String someone) {
    String greeterName = someone;
    greeterName = "me";
    greeterName = "me";
    greeterName = someone;
    return String.format("Hello, %s!", greeterName);
  }
}
