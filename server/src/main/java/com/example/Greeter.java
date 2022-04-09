package com.example;
import java.io.*;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
	System.out.println("Hai"); 
    return String.format("Hello, Welcome %s!", someone);
  }
}
